package com.cppfooddelivery.fooditems;

public class Fries implements FoodItem{
    private double basePrice = 5.0;
    private String name = "Fries";
    
    @Override
    public String getName() {return name;}

    @Override
    public double getPrice() {return basePrice;}
}
