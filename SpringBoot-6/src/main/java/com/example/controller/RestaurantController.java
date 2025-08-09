package com.example.controller;

import com.example.model.Food;
import com.example.model.Restaurant;
import com.example.repository.FoodRepository;
import com.example.repository.RestaurantRepository;
import com.example.exception.ResourceNotFoundException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@RestController
@RequestMapping("/api/restaurants")
public class RestaurantController {

    @Autowired
    private RestaurantRepository restaurantRepo;

    @Autowired
    private FoodRepository foodRepo;

    // Create a new Restaurant
    @PostMapping
    public Restaurant createRestaurant(@Valid @RequestBody Restaurant restaurant) {
        return restaurantRepo.save(restaurant);
    }

    // Get all Restaurants
    @GetMapping
    public List<Restaurant> getAllRestaurants() {
        return restaurantRepo.findAll();
    }

    // Get Restaurant by ID
    @GetMapping("/{id}")
    public Restaurant getRestaurantById(@PathVariable Long id) {
        return restaurantRepo.findById(id)
                .orElseThrow(() -> new ResourceNotFoundException("Restaurant not found with id: " + id));
    }

    // Delete Restaurant by ID
    @DeleteMapping("/{id}")
    public void deleteRestaurant(@PathVariable Long id) {
        Restaurant restaurant = restaurantRepo.findById(id)
                .orElseThrow(() -> new ResourceNotFoundException("Restaurant not found with id: " + id));
        restaurantRepo.delete(restaurant);
    }

    // Add Food to a Restaurant
    @PostMapping("/{id}/food")
    public Food addFoodToRestaurant(@PathVariable Long id, @Valid @RequestBody Food food) {
        Restaurant restaurant = restaurantRepo.findById(id)
                .orElseThrow(() -> new ResourceNotFoundException("Restaurant not found with id: " + id));
        food.setRestaurant(restaurant);
        return foodRepo.save(food);
    }

    // Delete Food by ID
    @DeleteMapping("/foods/{foodId}")
    public void deleteFood(@PathVariable Long foodId) {
        Food food = foodRepo.findById(foodId)
                .orElseThrow(() -> new ResourceNotFoundException("Food not found with id: " + foodId));
        foodRepo.delete(food);
    }
}
