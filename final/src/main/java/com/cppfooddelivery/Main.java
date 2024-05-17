package com.cppfooddelivery;

import java.util.*;
import java.time.*;

import com.cppfooddelivery.abstractfactory.DietPlan;
import com.cppfooddelivery.fooditems.*;

public class Main {
   public static void main(String[] args) {
      // Create Singleton instance of CPPFoodDelivery
      CPPFoodDelivery cpp = CPPFoodDelivery.getInstance();

      // Create all base food items available
      CreateFoodItemForMain createFoodItem = new CreateFoodItemForMain();

      // Create Customers
      Customer customer1 = new Customer("Customer 1", "123 Main St.", "LA",DietPlan.NO_RESTRICTION);
      Customer customer2 = new Customer("Customer 2", "123 Main St.", "LA",DietPlan.NO_RESTRICTION);
      Customer customer3 = new Customer("Customer 3", "123 Main St.", "LA",DietPlan.NO_RESTRICTION);
      Customer customer4 = new Customer("Customer 4", "123 Main St.", "LA",DietPlan.NO_RESTRICTION);
      Customer customer5 = new Customer("Customer 5", "456 Side St.", "Orange",DietPlan.VEGAN);
      Customer customer6 = new Customer("Customer 6", "456 Side St.", "Orange",DietPlan.VEGAN);
      Customer customer7 = new Customer("Customer 7", "456 Side St.", "Orange",DietPlan.VEGAN);
      Customer customer8 = new Customer("Customer 8", "789 Street St.", "San Bernardino",DietPlan.NUT_ALLERGY);
      Customer customer9 = new Customer("Customer 9", "789 Street St.", "San Bernardino",DietPlan.NUT_ALLERGY);
      Customer customer10 = new Customer("Customer 10", "789 Street St.", "San Bernardino",DietPlan.NUT_ALLERGY);

      // Creaet Drivers
      Driver d1 = new Driver("Driver 1","123 Main St.", "LA", "1st Shift");
      Driver d2 = new Driver("Driver 2","123 Main St.", "LA", "3rd Shift");
      Driver d3 = new Driver("Driver 3","456 Side St.", "Orange", "1st Shift");
      Driver d4 = new Driver("Driver 4","456 Side St.", "Orange", "3rd Shift");
      Driver d5 = new Driver("Driver 5","789 Street St.", "San Bernardino", "1st Shift");
      Driver d6 = new Driver("Driver 6","789 Street St.", "San Bernardino", "2nd Shift");
      Driver d7 = new Driver("Driver 7","789 Street St.", "San Bernardino", "3rd Shift");
      Driver d8 = new Driver("Driver 8","789 Street St.", "San Bernardino", "3rd Shift");

      // Create Menus
      Menu r1Menu = new Menu();
      r1Menu.add(createFoodItem.burger);

      Menu r2Menu = new Menu();
      r2Menu.add(createFoodItem.pizza);

      Menu r3Menu = new Menu();
      r3Menu.add(createFoodItem.hotdog);
      r3Menu.add(createFoodItem.taco);

      Menu r4Menu = new Menu();
      r4Menu.add(createFoodItem.burger);
      r4Menu.add(createFoodItem.fries);
      r4Menu.add(createFoodItem.taco);
      r4Menu.add(createFoodItem.pizza);

      // Create operating hours
      OperatingHours r1Hours = new OperatingHours(LocalTime.of(8,0), LocalTime.of(22,0));
      OperatingHours r2Hours = new OperatingHours(LocalTime.of(1,0), LocalTime.of(22,0));
      OperatingHours r3Hours = new OperatingHours(LocalTime.of(12,0), LocalTime.of(22,0));
      OperatingHours r4Hours = new OperatingHours(LocalTime.of(12,0), LocalTime.of(17,0));

      // Create restaurant    
      Restaurant r1 = new Restaurant("Burger Bakery", "123 Main", "LA", r1Hours, "American", r1Menu);
      Restaurant r2 = new Restaurant("Pizza Palace", "789 Street St.", "LA", r2Hours, "Italian", r2Menu);
      Restaurant r3 = new Restaurant("Theater", "789 Street St.", "San Bernardino", r3Hours, "Mexican", r3Menu);
      Restaurant r4 = new Restaurant("We Have It ALl", "456 Side St.", "Orange", r4Hours, "American", r4Menu);

      cpp.addCustomer(customer1);
      cpp.addCustomer(customer2);
      cpp.addCustomer(customer3);
      cpp.addCustomer(customer4);
      cpp.addCustomer(customer5);
      cpp.addCustomer(customer6);
      cpp.addCustomer(customer7);
      cpp.addCustomer(customer8);
      cpp.addCustomer(customer9);
      cpp.addCustomer(customer10);
      cpp.addDriver(d1);
      cpp.addDriver(d2);
      cpp.addDriver(d3);
      cpp.addDriver(d4);
      cpp.addDriver(d5);
      cpp.addDriver(d6);
      cpp.addDriver(d7);
      cpp.addDriver(d8);
      cpp.addRestaurant(r1);
      cpp.addRestaurant(r2);
      cpp.addRestaurant(r3);
      cpp.addRestaurant(r4);

      customer1.createMeal();
   }

   
}

