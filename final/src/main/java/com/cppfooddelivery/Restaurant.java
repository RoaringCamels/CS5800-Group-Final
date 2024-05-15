package com.cppfooddelivery;
import java.util.*;

class Restaurant implements Observer {
    private String name;
    private String address;
    private String county;
    private OperatingHours hours;
    private String cuisine;
    private List<Meal> menu;

    public Restaurant(String name, String address, String county, OperatingHours hours, String cuisine, List<Meal> menu) {
        this.name = name;
        this.address = address;
        this.county = county;
        this.hours = hours;
        this.cuisine = cuisine;
        this.menu = menu;
    }

    public String getName(){return name;}
    public String getAddress() {return address;}
    public String getCounty() {return county;}
    public OperatingHours getHours() {return hours;}
    public String getCuisine() {return cuisine;}
    public List<Meal> getMenu() {return menu;}

    public boolean isOperating(Date time) {
        return hours.isWithinOperatingHours(time);
    }

    @Override
    public void notify(Order order) {
        System.out.println("Restaurant " + name + " received order " + order.getId());
    }

}

