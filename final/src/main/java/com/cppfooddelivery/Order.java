package com.cppfooddelivery;

import java.time.LocalTime;
import com.cppfooddelivery.fooditems.FoodItem;
import com.cppfooddelivery.observer.*;;

public class Order {
    private Customer customer;
    private Restaurant restaurant;
    private FoodItem foodItem;
    private Driver driver;
    private LocalTime orderTime;
    private LocalTime pickupTime;
    private LocalTime deliveryTime;
    private String status;
    private OrderSubject orderSubject;

    public Order(Customer customer, Restaurant restaurant, FoodItem foodItem) {
        this.customer = customer;
        this.restaurant = restaurant;
        this.foodItem = foodItem;
        this.orderTime = LocalTime.now();
        this.status = "Placed";
        this.orderTime = LocalTime.now();
        notifyRestaurant();
        
    }

    public String getStatus() { return status; }
    public Customer getCustomer() { return customer; }
    public Restaurant getRestaurant() { return restaurant; }
    public FoodItem getFoodItem() { return foodItem; }
    public Driver getDriver() { return driver; }
    public LocalTime getOrderTime() { return orderTime; }
    public LocalTime getPickupTime() { return pickupTime; }
    public LocalTime getDeliveryTime() { return deliveryTime; }

    public void assignDriver(Driver driver) {
        this.driver = driver;
        this.status = "Driver Assigned";
    }

    public void pickUp() {
        this.pickupTime = LocalTime.now();
        this.status = "Picked Up";
    }

    public void deliver() {
        this.deliveryTime = LocalTime.now();
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