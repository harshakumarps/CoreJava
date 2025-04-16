package com.xworkz.internal;

public class Tablet extends Device {
    private double screenSize;
    private boolean hasStylus;

    public Tablet(String brand, String model, double screenSize, boolean hasStylus) {
        super(brand, model);
        this.screenSize = screenSize;
        this.hasStylus = hasStylus;
    }

    @Override
    public void turnOn() {
        System.out.println("Turning on " + brand + " " + model + " tablet.");
    }

    public void draw() {
        if (hasStylus) {
            System.out.println("Drawing on the " + brand + " " + model + " tablet.");
        } else {
            System.out.println("Drawing is not supported on this tablet.");
        }
    }

    @Override
    public String toString() {
        return "Tablet [brand=" + brand + ", model=" + model + ", screenSize=" + screenSize + ", hasStylus=" + hasStylus + "]";
    }
}