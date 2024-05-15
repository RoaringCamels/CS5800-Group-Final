package com.cppfooddelivery;
import java.sql.Time;
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

    public boolean isAvailable(Date time) {
        Time currentTime = new Time(time.getTime());
        switch (shift) {
            case "1st shift":
                return currentTime.after(Time.valueOf("08:00:00")) && currentTime.before(Time.valueOf("16:00:00"));
            case "2nd shift":
                return currentTime.after(Time.valueOf("16:00:00")) && currentTime.before(Time.valueOf("00:00:00"));
            case "3rd shift":
                return currentTime.after(Time.valueOf("00:00:00")) && currentTime.before(Time.valueOf("08:00:00"));
            default:
                return false;
        }
    }
}

