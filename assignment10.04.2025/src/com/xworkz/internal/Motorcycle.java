// com.xworkz.internal.Motorcycle.java
package com.xworkz.internal;

public class Motorcycle extends Vehicle {
    private boolean hasSidecar;

    public Motorcycle(String model, String fuelType, boolean hasSidecar) {
        super(model, fuelType);
        this.hasSidecar = hasSidecar;
    }

    @Override
    public void start() {
        System.out.println(model + " (Motorcycle) is roaring to life!");
    }

    public void wheelie() {
        System.out.println(model + " is doing a wheelie!");
    }

    @Override
    public String toString() {
        return "Motorcycle [model=" + model + ", fuelType=" + fuelType + ", hasSidecar=" + hasSidecar + "]";
    }
}