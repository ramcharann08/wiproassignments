package com.example.uber.controller;

import com.example.uber.model.Ride;
import com.example.uber.repository.RideRepository;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/rides")
public class MessageController {

    private final RideRepository rideRepository;

    public MessageController(RideRepository rideRepository) {
        this.rideRepository = rideRepository;
    }

    // GET /rides -> list all rides from MySQL
    @GetMapping
    public List<Ride> getAll() {
        return rideRepository.findAll();
    }

    // GET /rides/{id}
    @GetMapping("/{id}")
    public Ride getOne(@PathVariable Long id) {
        Optional<Ride> r = rideRepository.findById(id);
        return r.orElse(null);
    }
}
