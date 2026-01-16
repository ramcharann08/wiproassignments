package com.example.uber.service;

import com.example.uber.dto.RideMessage;
import com.example.uber.model.Ride;
import com.example.uber.repository.RideRepository;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class KafkaConsumerService {

    private final RideRepository rideRepository;
    private final ObjectMapper mapper = new ObjectMapper();

    public KafkaConsumerService(RideRepository rideRepository) {
        this.rideRepository = rideRepository;
    }

    @KafkaListener(topics = "uber-ride-topic", groupId = "uber_ride_group")
    public void listen(String message) {
        try {
            RideMessage msg = mapper.readValue(message, RideMessage.class);
            String op = (msg.getOperation() != null) ? msg.getOperation().toUpperCase() : "";

            switch (op) {
                case "CREATE":
                    Ride newRide = toEntity(msg);
                    // only save if not exists - or overwrite
                    rideRepository.save(newRide);
                    System.out.println("CREATE: saved ride id=" + newRide.getId());
                    break;
                case "UPDATE":
                    Optional<Ride> existing = rideRepository.findById(msg.getId());
                    if (existing.isPresent()) {
                        Ride r = existing.get();
                        if (msg.getDriverName() != null) r.setDriverName(msg.getDriverName());
                        if (msg.getPassengerName() != null) r.setPassengerName(msg.getPassengerName());
                        if (msg.getPickupLocation() != null) r.setPickupLocation(msg.getPickupLocation());
                        if (msg.getDropLocation() != null) r.setDropLocation(msg.getDropLocation());
                        if (msg.getFare() != null) r.setFare(msg.getFare());
                        rideRepository.save(r);
                        System.out.println("UPDATE: updated ride id=" + r.getId());
                    } else {
                        System.out.println("UPDATE: ride id not found: " + msg.getId());
                    }
                    break;
                case "DELETE":
                    rideRepository.deleteById(msg.getId());
                    System.out.println("DELETE: deleted ride id=" + msg.getId());
                    break;
                default:
                    System.out.println("Unknown operation: " + op);
            }
        } catch (Exception e) {
            System.err.println("Failed to handle message: " + e.getMessage());
            e.printStackTrace();
        }
    }

    private Ride toEntity(RideMessage msg) {
        Ride r = new Ride();
        r.setId(msg.getId());
        r.setDriverName(msg.getDriverName());
        r.setPassengerName(msg.getPassengerName());
        r.setPickupLocation(msg.getPickupLocation());
        r.setDropLocation(msg.getDropLocation());
        r.setFare(msg.getFare());
        return r;
    }
}
