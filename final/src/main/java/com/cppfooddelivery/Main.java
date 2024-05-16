package com.cppfooddelivery;

import java.util.*;
import java.time.*;
import com.cppfooddelivery.fooditems.*;

public class Main {
   OperatingHours r1Hours = new OperatingHours(LocalTime.of(8,0), LocalTime.of(22,0));
   Restaurant r1 = new Restaurant("r1", "123 Main", "LA", r1Hours, "Mexican", null);
   FoodItem burger = new Burger();
   FoodItem fries = new Fries();
}

