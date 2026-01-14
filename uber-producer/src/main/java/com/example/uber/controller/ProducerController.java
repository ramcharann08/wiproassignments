package com.example.uber.controller;

import com.example.uber.dto.RideMessage;
import com.example.uber.service.ProducerService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/rides")
public class ProducerController {

    private final ProducerService producerService;

    public ProducerController(ProducerService producerService) {
        this.producerService = producerService;
    }

    // Create new ride -> sends CREATE message to Kafka
    @PostMapping
    public ResponseEntity<String> createRide(@RequestBody RideMessage request) {
        if (request.getId() == null) {
            // generate simple id if not provided
            request.setId(System.currentTimeMillis());
        }
        request.setOperation("CREATE");
        producerService.sendMessage(request);
        return ResponseEntity.ok("CREATE message sent for id: " + request.getId());
    }

    // Update existing ride -> sends UPDATE message to Kafka
    @PutMapping("/{id}")
    public ResponseEntity<String> updateRide(@PathVariable("id") Long id, @RequestBody RideMessage request) {
        request.setId(id);
        request.setOperation("UPDATE");
        producerService.sendMessage(request);
        return ResponseEntity.ok("UPDATE message sent for id: " + id);
    }

    // Cancel / Delete ride -> sends DELETE message to Kafka
    @DeleteMapping("/{id}")
    public ResponseEntity<String> deleteRide(@PathVariable("id") Long id) {
        RideMessage msg = new RideMessage();
        msg.setId(id);
        msg.setOperation("DELETE");
        producerService.sendMessage(msg);
        return ResponseEntity.ok("DELETE message sent for id: " + id);
    }

    // Optional GET — producer can mock retrieve (DB is on consumer side)
    @GetMapping("/{id}")
    public ResponseEntity<RideMessage> getMockRide(@PathVariable("id") Long id) {
        RideMessage m = new RideMessage();
        m.setId(id);
        m.setDriverName("Mock Driver");
        m.setPassengerName("Mock Passenger");
        m.setPickupLocation("MockPickup");
        m.setDropLocation("MockDrop");
        m.setFare(0.0);
        return ResponseEntity.ok(m);
    }
}
