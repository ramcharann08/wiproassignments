package com.example.deliveryclient.controller;

import com.example.deliveryclient.service.DeliveryService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Map;

@RestController
@RequestMapping("/client")
public class ClientController {

    private final DeliveryService deliveryService;

    public ClientController(DeliveryService deliveryService) {
        this.deliveryService = deliveryService;
    }

    // GET http://localhost:8080/client/delivery/1
    // add ?fail=true to instruct external to fail
    @GetMapping("/delivery/{id}")
    public ResponseEntity<Map<String, Object>> getDelivery(@PathVariable String id,
                                                           @RequestParam(defaultValue = "false") boolean fail) {
        Map<String, Object> result = deliveryService.getDeliveryStatus(id, fail);
        return ResponseEntity.ok(result);
    }
}