package com.cppfooddelivery;
import java.util.*;

import com.cppfooddelivery.fooditems.FoodItem;

public class CPPFoodDelivery {
    private static CPPFoodDelivery instance = null;
    private List<Customer> customersList;
    private List<Restaurant> restaurantsList;
    private List<Driver> driversList;
    private List<Order> ordersList;

    private CPPFoodDelivery(){
        customersList = new ArrayList<>();
        restaurantsList = new ArrayList<>();
        driversList = new ArrayList<>();
    }

    public static CPPFoodDelivery getInstance(){
        if (instance == null){
            instance = new CPPFoodDelivery();
        }
        return instance;
    }

    public List<Customer> getCustomersList() {return customersList;}
    public List<Restaurant> getRestaurantsList() {return restaurantsList;}
    public List<Driver> getDriversList() {return driversList;}
    public List<Order> getOrdersList() {return ordersList;}

    public void addCustomer(Customer newCustomer){customersList.add(newCustomer);}
    public void addRestaurant(Restaurant newRestaurant){restaurantsList.add(newRestaurant);}
    public void addDriver(Driver newDriver){driversList.add(newDriver);}

    public void placeOrder(Customer customer, Restaurant restaurant, FoodItem foodItem) {
        Order order = new Order(customer, restaurant, foodItem);
        ordersList.add(order);
        System.out.println("Order placed by " + customer.getName() + " for " + foodItem.getName() + " at " + restaurant.getName());
    }

    public void assignDriverToOrder(Order order, Driver driver) {
        order.assignDriver(driver);
        System.out.println("Driver " + driver.getName() + " assigned to order for " + order.getCustomer().getName());
    }

    public void pickUpOrder(Order order) {
        order.pickUp();
        System.out.println("Order for " + order.getCustomer().getName() + " picked up by " + order.getDriver().getName());
    }

    public void deliverOrder(Order order) {
        order.deliver();
        System.out.println("Order for " + order.getCustomer().getName() + " delivered by " + order.getDriver().getName());
    }
}