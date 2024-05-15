package com.cppfooddelivery;
import java.util.*;

// Singleton Pattern
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
        ordersList = new ArrayList<>();
    }

    public static CPPFoodDelivery getInstance(){
        if (instance == null){
            instance = new CPPFoodDelivery();
        }
        return instance;
    }

    public void addCustomer(Customer newCustomer){customersList.add(newCustomer);}
    public void addCustomer(Restaurant newRestaurant){restaurantsList.add(newRestaurant);}
    public void addCustomer(Driver newDriver){driversList.add(newDriver);}
    public void addOrder(Order newOrder){
        if (isValidOrder(newOrder)){
            ordersList.add(newOrder);
            newOrder.getRestaurant().notify(newOrder);
            newOrder.getDriver().notify(newOrder);
        } else{
            System.out.println("Order " + newOrder.getId() + " cannot be processed at this time.");
        }
    }

    private boolean isValidOrder(Order newOrder){
        Date orderTime = newOrder.getCreationTime();
        Restaurant restaurant = newOrder.getRestaurant();
        Driver driver = newOrder.getDriver();
        
        if (!restaurant.isOperating(orderTime)) {
            System.out.println("Restaurant " + restaurant.getName() + " is not operating at the time of order.");
            return false;
        }

        if (!driver.isAvailable(orderTime) || !driver.getCounty().equals(newOrder.getCustomer().getCounty())) {
            System.out.println("Driver " + driver.getName() + " is not available or does not serve the customer's county.");
            return false;
        }
        
        return true;
    }
}