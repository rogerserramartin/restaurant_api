package com.restaurants.demo.restaurant.model;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Getter @Setter
@Entity//this maps the restaurant to the database. this one is for Hibernate, so it can create the table
// we don't need to create the database scrips anymore, this annotation does it for us (no more Create table...)
@Table //this one is for our table in the database
public class Restaurant {
    @Id
    @SequenceGenerator(
            name = "restaurant_sequence",
            sequenceName = "restaurant_sequence",
            allocationSize = 1
    )
    @GeneratedValue(
            strategy = GenerationType.SEQUENCE,
            generator = "restaurant_sequence"
    )
    private Long id;
    private String name;
    private String address;
    private String cuisineType;
    private String score;
    private Double price;

    public Restaurant(Long id,
                      String name,
                      String address,
                      String cuisineType,
                      String score,
                      Double price) {
        this.id = id;
        this.name = name;
        this.address = address;
        this.cuisineType = cuisineType;
        this.score = score;
        this.price = price;
    }

    public Restaurant(String name,
                      String address,
                      String cuisineType,
                      String score,
                      Double price) {
        this.name = name;
        this.address = address;
        this.cuisineType = cuisineType;
        this.score = score;
        this.price = price;
    }

    @Override
    public String toString() {
        return "Restaurant{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", address='" + address + '\'' +
                ", cuisineType='" + cuisineType + '\'' +
                ", score='" + score + '\'' +
                ", price=" + price +
                '}';
    }
}
