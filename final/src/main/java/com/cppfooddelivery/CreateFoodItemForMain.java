package com.cppfooddelivery;

import com.cppfooddelivery.fooditems.*;

public class CreateFoodItemForMain {
    FoodItem burger = new Burger(); 
    FoodItem fries = new Fries(); 
    FoodItem hotdog = new HotDog(); 
    FoodItem pizza = new Pizza(); 
    FoodItem taco = new Taco(); 

    public CreateFoodItemForMain(){
        burger = new Burger();
        fries = new Fries();
        hotdog = new HotDog();
        pizza = new Pizza();
        taco = new Taco();
    }
}
