package com.cppfooddelivery.fooditems.toppings;
import com.cppfooddelivery.fooditems.FoodItem;
import com.cppfooddelivery.abstractfactory.carbs.Carbs;

public class Cheese implements Topping, Carbs{
    private String name = "Cheese";
    private FoodItem foodItem;
    private double toppingsPrice = 1.0;

    public Cheese(FoodItem foodItem){this.foodItem = foodItem;}
    @Override
    public String getName() {
        return " with " + name;
    }

    @Override
    public double getPrice() {
        return foodItem.getPrice() + toppingsPrice;
    }
    @Override
    public String getFood() {return "Cheese";}
    
}
