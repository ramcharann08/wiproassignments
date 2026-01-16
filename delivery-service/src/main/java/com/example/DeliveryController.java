package com.example;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.time.Instant;
import java.util.Map;

@RestController
@RequestMapping("/delivery")
public class DeliveryController {

    // GET /delivery/status?id=1 or /delivery/status?id=1&fail=true
    @GetMapping("/status")
    public ResponseEntity<?> getStatus(
            @RequestParam(required = false, defaultValue = "1") String id,
            @RequestParam(required = false, defaultValue = "false") boolean fail) {

        if (fail) {
            // simulate server error
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR)
                    .body(Map.of("error", "simulated failure"));
        }

        return ResponseEntity.ok(Map.of(
                "id", id,
                "status", "DELIVERED",
                "timestamp", Instant.now().toString()
        ));
    }
}
