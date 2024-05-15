package com.cppfooddelivery;

public class Restaurant {
    private String name;
    private String address;
    private String county;
    private OperatingHours operatingHours;
    private String cuisine;
    private Menu menu;

    public Restaurant (String name, String address, String county, OperatingHours operatingHours, String cuisine, Menu menu){
        this.name = name;
        this.address = address;
        this.county = county;
        this.operatingHours = operatingHours;
        this.cuisine = cuisine;
        this.menu = menu;
    }

    public String getName() {return name;}
    public String getAddress() {return address;}
    public String getCounty() {return county;}
    public OperatingHours getOperatingHours() {return operatingHours;}
    public String getCuisine() {return cuisine;}
    public Menu getMenu() {return menu;}
}
