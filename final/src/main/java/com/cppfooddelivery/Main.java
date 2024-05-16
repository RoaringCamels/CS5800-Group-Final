package com.cppfooddelivery;

import java.util.*;
import java.time.*;

import com.cppfooddelivery.abstractfactory.DietPlan;
import com.cppfooddelivery.fooditems.*;

public class Main {
   public static void main(String[] args) {
      OperatingHours r1Hours = new OperatingHours(LocalTime.of(8,0), LocalTime.of(22,0));
      
      Restaurant r1 = new Restaurant("r1", "123 Main", "LA", r1Hours, "Mexican", null);
      FoodItem burger = new Burger();
      FoodItem fries = new Fries();

      Customer customer1 = new Customer("Customer1", "LA", "123 Main St.",DietPlan.NO_RESTRICTION);
      Customer customer2 = new Customer("Customer2", "LA", "123 Main St.",DietPlan.NO_RESTRICTION);
      Customer customer3 = new Customer("Customer3", "LA", "123 Main St.",DietPlan.NO_RESTRICTION);
      Customer customer4 = new Customer("Customer4", "LA", "123 Main St.",DietPlan.NO_RESTRICTION);
      Customer customer5 = new Customer("Customer5", "Orange", "123 Main St.",DietPlan.NO_RESTRICTION);
      Customer customer6 = new Customer("Customer6", "Orange", "123 Main St.",DietPlan.NO_RESTRICTION);
      Customer customer7 = new Customer("Customer7", "Orange", "123 Main St.",DietPlan.NO_RESTRICTION);
      Customer customer8 = new Customer("Customer8", "San Bernardino", "123 Main St.",DietPlan.NO_RESTRICTION);
      Customer customer9 = new Customer("Customer9", "San Bernardino", "123 Main St.",DietPlan.NO_RESTRICTION);
      Customer customer10 = new Customer("Customer10", "San Bernardino", "123 Main St.",DietPlan.NO_RESTRICTION);

      customer1.createMeal();
   }

   
}

