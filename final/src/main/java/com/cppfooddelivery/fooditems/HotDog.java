package com.cppfooddelivery.fooditems;

public class HotDog implements FoodItem{
    private double basePrice = 10.0;
    private String name = "Hot Dog";
    
    @Override
    public String getName() {return name;}

    @Override
    public double getPrice() {return basePrice;}
    
}
