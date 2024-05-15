package com.cppfooddelivery;

public class Customer {
    private String name;
    private String address;
    private String county;

    public Customer(String name, String address, String county) {
        this.name = name;
        this.address = address;
        this.county = county;
    }

    public String getName() {return name;}
    public String getAddress() {return address;}
    public String getCounty() {return county;}
}

