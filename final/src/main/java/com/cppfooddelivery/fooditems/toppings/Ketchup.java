package com.cppfooddelivery.fooditems.toppings;
import com.cppfooddelivery.fooditems.FoodItem;

public class Ketchup implements Topping{
    private String name = "Ketchup";
    private FoodItem foodItem;
    private double toppingsPrice = 1.0;

    public Ketchup(FoodItem foodItem){this.foodItem = foodItem;}
    @Override
    public String getName() {
        return " with " + name;
    }

    @Override
    public double getPrice() {
        return foodItem.getPrice() + toppingsPrice;
    }
    
}
