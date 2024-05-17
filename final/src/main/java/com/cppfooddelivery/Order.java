package com.cppfooddelivery;

import java.time.LocalDateTime;
import com.cppfooddelivery.fooditems.FoodItem;

public class Order {
    private Customer customer;
    private Restaurant restaurant;
    private FoodItem foodItem;
    private Driver driver;
    private LocalDateTime orderTime;
    private LocalDateTime pickupTime;
    private LocalDateTime deliveryTime;
    private String status;

    public Order(Customer customer, Restaurant restaurant, FoodItem foodItem) {
        this.customer = customer;
        this.restaurant = restaurant;
        this.foodItem = foodItem;
        this.orderTime = LocalDateTime.now();
        this.status = "Placed";
    }

    public String getStatus() {return status;}
    public Customer getCustomer() {return customer;}
    public Restaurant getRestaurant() {return restaurant;}
    public FoodItem getFoodItem() {return foodItem;}
    public Driver getDriver() {return driver;}
    public LocalDateTime getOrderTime() {return orderTime;}
    public LocalDateTime getPickupTime() {return pickupTime;}
    public LocalDateTime getDeliveryTime() {return deliveryTime;}

    public void assignDriver(Driver driver) {
        this.driver = driver;
        this.status = "Driver Assigned";
    }

    public void pickUp() {
        this.pickupTime = LocalDateTime.now();
        this.status = "Picked Up";
    }

    public void deliver() {
        this.deliveryTime = LocalDateTime.now();
        this.status = "Delivered";
    }

    @Override
    public String toString() {
        return "Order{" +
                "customer=" + customer.getName() +
                ", restaurant=" + restaurant.getName() +
                ", foodItem=" + foodItem.getName() +
                ", driver=" + (driver != null ? driver.getName() : "Not assigned") +
                ", status='" + status + '\'' +
                '}';
    }
}

