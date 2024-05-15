package com.cppfooddelivery;
import java.util.*;

class Order {
    private static int idCounter = 0;
    private int id;
    private Customer customer;
    private Restaurant restaurant;
    private Driver driver;
    private List<Meal> meals;
    private Date creationTime;
    private Date pickupTime;
    private Date deliveryTime;

    public Order(Customer customer, Restaurant restaurant, Driver driver, List<Meal> meals, Date creationTime) {
        this.id = ++idCounter;
        this.customer = customer;
        this.restaurant = restaurant;
        this.driver = driver;
        this.meals = meals;
        this.creationTime = creationTime;
    }

    public int getId() {return id;}
    public Customer getCustomer() {return customer;}
    public Restaurant getRestaurant() {return restaurant;}
    public Driver getDriver() {return driver;}
    public List<Meal> getMeals() {return meals;}
    public Date getCreationTime() {return creationTime;}
    public Date getPickupTime() {return pickupTime;}
    public Date getDeliveryTime() {return deliveryTime;}

    public void setPickupTime(Date pickupTime) {this.pickupTime = pickupTime;}
    public void setDeliveryTime(Date deliveryTime) {this.deliveryTime = deliveryTime;}

    @Override
    public String toString() {
        return "Order " + id + ": " + meals.toString();
    }
}
