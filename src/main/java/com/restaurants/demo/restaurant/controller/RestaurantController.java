package com.restaurants.demo.restaurant.controller;

// API Layer

import com.restaurants.demo.restaurant.model.Restaurant;
import com.restaurants.demo.restaurant.service.RestaurantService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(path = "api/v1/restaurant") //localhost:8080/api/v1/restaurant
public class RestaurantController {

    private final RestaurantService restaurantService; //this restaurantService should be autowired to the constructor. it's like magical instantiation for us

    @Autowired    //this is the same as this.restaurantService = new RestaurantService();
    public RestaurantController(RestaurantService restaurantService) {
        this.restaurantService = restaurantService;
    }

    @GetMapping
    public List<Restaurant> getRestaurants() {
    return restaurantService.getAll();
    }

}
