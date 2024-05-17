package com.cppfooddelivery;

import java.util.*;
import com.cppfooddelivery.fooditems.*;
public class Menu {
    private ArrayList<FoodItem> foodItemList;

    public Menu(){
        this.foodItemList = new ArrayList<FoodItem>();
    }

    public List<FoodItem> getFoodItemList() {return foodItemList;}

    public void add(FoodItem item) {foodItemList.add(item);}
}
