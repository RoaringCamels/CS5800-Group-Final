package com.cppfooddelivery;

import java.util.List;

public class ConcreteFactory extends Factory{

    @Override
    public Customer createCustomer(String name, String address, String county) {
        return new Customer(name, address, county);
    }

    @Override
    public Restaurant createRestaurant(String name, String address, String county, OperatingHours hours, String cuisine, List<Meal> menu) {
        return new Restaurant(name, address, county, hours, cuisine, menu);
    }

    @Override
    public Driver createDriver(String name, String address, String county, String shift) {
        return new Driver(name, address, county, shift);
    }
    
}
