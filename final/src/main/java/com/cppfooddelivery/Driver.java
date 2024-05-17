package com.cppfooddelivery;

import java.time.LocalTime;

class Driver{
    private String name;
    private String address;
    private String county;
    private String shift;

    public Driver(String name, String address, String county, String shift) {
        this.name = name;
        this.address = address;
        this.county = county;
        this.shift = shift;
    }

    public String getName() {return name;}
    public String getAddress() {return address;}
    public String getCounty() {return county;}
    public String getShift() {return shift;}

    public boolean isAvailable(LocalTime time, OperatingHours restaurantHours) {
        switch (shift) {
            case "1st Shift":
                return time.isAfter(restaurantHours.getOpenTime()) && time.isBefore(restaurantHours.getCloseTime());
            case "2nd Shift":
                return time.isAfter(restaurantHours.getCloseTime()) && time.isBefore(restaurantHours.getOpenTime());
            case "3rd Shift":
                return time.isAfter(restaurantHours.getCloseTime().plusHours(8)) && time.isBefore(restaurantHours.getOpenTime().plusHours(8));
            default:
                return false;
        }
    }
    
    
}

