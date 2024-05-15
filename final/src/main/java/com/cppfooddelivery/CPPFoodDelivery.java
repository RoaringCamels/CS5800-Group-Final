package com.cppfooddelivery;
import java.util.*;

// Singleton Pattern
public class CPPFoodDelivery {
    private static CPPFoodDelivery instance = null;
    private List<Customer> customersList;
    private List<Restaurant> restaurantList;
    private List<Driver> driverList;
    private List<Order> orderList;

    private CPPFoodDelivery(){
        customersList = new ArrayList<>();
        restaurantList = new ArrayList<>();
        driverList = new ArrayList<>();
        orderList = new ArrayList<>();
    }

    public static CPPFoodDelivery getInstance(){
        if (instance == null){
            instance = new CPPFoodDelivery();
        }
        return instance;
    }

}
