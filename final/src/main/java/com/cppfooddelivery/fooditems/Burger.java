package com.cppfooddelivery.fooditems;

public class Burger implements FoodItem{
    private double basePrice = 10.0;
    private String name = "Burger";
    
    @Override
    public String getName() {return name;}

    @Override
    public double getPrice() {return basePrice;}
    
}
