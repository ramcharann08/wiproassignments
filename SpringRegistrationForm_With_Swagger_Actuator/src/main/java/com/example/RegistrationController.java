package com.example;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RegistrationController {

    @GetMapping("/register")
    public String register(@RequestParam String name, @RequestParam String email) {
        return "Registered with Name: " + name + ", Email: " + email;
    }

    @GetMapping("/")
    public String home() {
        return "Welcome to the Registration Form!";
    }
}
