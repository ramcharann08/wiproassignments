package com.example.controller;
import org.springframework.web.bind.annotation.*;
import com.example.model.User;

@RestController
@RequestMapping("/user")
public class UserController {

    @PostMapping
    public String createUser(@RequestBody User user) {
        return "User received: " + user.getFirstName() + " " + user.getLastName() + ", Age: " + user.getAge();
    }
}
