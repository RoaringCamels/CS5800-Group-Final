package com.cppfooddelivery;
import java.util.*;

abstract class Factory {
    public abstract Customer createCustomer(String name, String address, String county);
    public abstract Restaurant createRestaurant(String name, String address, String county, OperatingHours hours, String cuisine, List<Meal> menu);
    public abstract Driver createDriver(String name, String address, String county, String shift);
}
