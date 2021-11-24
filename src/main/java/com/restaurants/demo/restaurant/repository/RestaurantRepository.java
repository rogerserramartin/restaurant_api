package com.restaurants.demo.restaurant.repository;

import com.restaurants.demo.restaurant.model.Restaurant;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RestaurantRepository
        extends JpaRepository<Restaurant, Long> {
}
