// com.xworkz.internal.Vehicle.java
package com.xworkz.internal;

public class Vehicle {
    protected String model;
    protected String fuelType;

    public Vehicle(String model, String fuelType) {
        this.model = model;
        this.fuelType = fuelType;
    }

    public void start() {
        System.out.println(model + " is starting.");
    }

    @Override
    public String toString() {
        return "Vehicle [model=" + model + ", fuelType=" + fuelType + "]";
    }
}