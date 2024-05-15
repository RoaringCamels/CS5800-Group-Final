package com.cppfooddelivery;
import java.util.*;

public class CPPFoodDelivery {
    private static CPPFoodDelivery instance = null;
    private List<Customer> customersList;
    private List<Restaurant> restaurantsList;
    private List<Driver> driversList;

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

    public void addCustomer(Customer newCustomer){customersList.add(newCustomer);}
    public void addRestaurant(Restaurant newRestaurant){restaurantsList.add(newRestaurant);}
    public void addDriver(Driver newDriver){driversList.add(newDriver);}

    public List<Customer> getCustomersList() {return customersList;}
    public List<Restaurant> getRestaurantsList() {return restaurantsList;}
    public List<Driver> getDriversList() {return driversList;}
}