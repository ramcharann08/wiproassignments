package com.example.service;

import com.example.model.User;
import com.example.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.*;

@Service
public class UserService {

    @Autowired
    private UserRepository repository;

    public List<User> getAllUsers() {
        return repository.findAll();
    }

    public Optional<User> getUserById(Long id) {
        return repository.findById(id);
    }

    public User saveUser(User user) {
        return repository.save(user);
    }

    public User updateUser(Long id, User newUser) {
        return repository.findById(id).map(user -> {
            user.setName(newUser.getName());
            user.setAge(newUser.getAge());
            user.setSalary(newUser.getSalary());
            return repository.save(user);
        }).orElse(null);
    }

    public void deleteUser(Long id) {
        repository.deleteById(id);
    }
}