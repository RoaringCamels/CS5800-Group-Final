package com.cppfooddelivery;

import java.util.ArrayList;
import java.util.List;

public class FoodItemDecorator implements MenuDecorator{
    private Menu menu;
    private List<MenuItem> foodItems;

    public FoodItemDecorator(Menu menu) {
        this.menu = menu;
        this.foodItems = new ArrayList<>();
    }

    @Override
    public void addFoodItem(MenuItem item) {
        foodItems.add(item);
    }

    @Override
    public void addItem(MenuItem item) {
        menu.addItem(item);
    }

    @Override
    public List<MenuItem> getMenuItems() {
        List<MenuItem> items = new ArrayList<>(menu.getMenuItems());
        items.addAll(foodItems);
        return items;
    }
    
}
