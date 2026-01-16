package com.example.service;

import com.example.model.User;
import com.example.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {

    @Autowired
    private UserRepository repo;

    public List<User> getAllUsers() {
        return repo.findAll();
    }

    public User createUser(User user) {
        return repo.save(user);
    }

    public User getUserById(Long id) {
        return repo.findById(id).orElse(null);
    }

    public void deleteUser(Long id) {
        repo.deleteById(id);
    }

    public User updateUser(Long id, User userDetails) {
        User user = repo.findById(id).orElse(null);
        if (user != null) {
            user.setName(userDetails.getName());
            user.setAge(userDetails.getAge());
            user.setSalary(userDetails.getSalary());
            return repo.save(user);
        }
        return null;
    }
}
