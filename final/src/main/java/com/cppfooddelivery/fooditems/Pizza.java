package com.cppfooddelivery.fooditems;

public class Pizza implements FoodItem{
    private double basePrice = 10.0;
    private String name = "Pizza";
    
    @Override
    public String getName() {return name;}

    @Override
    public double getPrice() {return basePrice;}
    
}
