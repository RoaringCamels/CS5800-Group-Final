package com.cppfooddelivery.fooditems.toppings;
import com.cppfooddelivery.fooditems.*;

public class Ketchup extends FoodItemDecorator {
    public Ketchup(FoodItemComponent foodItem) {
        super(foodItem);
    }

    @Override
    public String getDescription() {
        return foodItem.getDescription() + ", with cheese";
    }

    @Override
    public double getCost() {
        return foodItem.getCost() + 1.50; // Adding cost for cheese
    }

    @Override
    public String getName() {
        return "Ketchup";
    }
}
