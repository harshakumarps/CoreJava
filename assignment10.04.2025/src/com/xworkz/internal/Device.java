// com.xworkz.internal.Device.java
package com.xworkz.internal;

public class Device {
    protected String brand;
    protected String model;

    public Device(String brand, String model) {
        this.brand = brand;
        this.model = model;
    }

    public void turnOn() {
        System.out.println("Turning on " + brand + " " + model + ".");
    }

    @Override
    public String toString() {
        return "Device [brand=" + brand + ", model=" + model + "]";
    }
}