package com.restaurants.demo.restaurant.service;

import com.restaurants.demo.restaurant.model.Restaurant;
import org.springframework.stereotype.Service;

import java.util.List;
//this is a class that has to be instantiated, it has to be a Spring Bean
@Service //layer that manages the business logic
public class RestaurantService {

    public List<Restaurant> getAll(){
        return List.of(new Restaurant(
                1L,
                "Robert de Nola",
                "Passeig del Remei, 48-50, 08140 Caldes de Montbui España",
                "Mediterranean",
                "4,5/5",
                30.00));

    }

}
