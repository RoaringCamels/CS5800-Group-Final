package com.cppfooddelivery.fooditems;

public class Taco implements FoodItem{
    private double basePrice = 10.0;
    private String name = "Taco";
    
    @Override
    public String getName() {return name;}

    @Override
    public double getPrice() {return basePrice;}
    
}
