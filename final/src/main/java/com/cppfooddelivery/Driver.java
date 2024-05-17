package com.cppfooddelivery;
import java.sql.Time;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.util.*;

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

    public boolean isAvailable(LocalDateTime dateTime) {
    LocalTime currentTime = dateTime.toLocalTime();
    switch (shift) {
        case "1st shift":
            return currentTime.isAfter(LocalTime.of(8, 0)) && currentTime.isBefore(LocalTime.of(16, 0));
        case "2nd shift":
            return currentTime.isAfter(LocalTime.of(16, 0)) || currentTime.isBefore(LocalTime.of(8, 0));
        case "3rd shift":
            return currentTime.isAfter(LocalTime.of(0, 0)) && currentTime.isBefore(LocalTime.of(8, 0));
        default:
            return false;
    }
}

