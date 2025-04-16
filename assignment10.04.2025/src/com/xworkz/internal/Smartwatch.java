package com.xworkz.internal;

public class Smartwatch extends ElectronicDevice {
    protected boolean hasTouchScreen;

    public Smartwatch(String model, String manufacturer, boolean hasTouchScreen) {
        super(model, manufacturer);
        this.hasTouchScreen = hasTouchScreen;
    }

    public void displayTime() {
        System.out.println(model + " is displaying the time.");
    }

    @Override
    public String toString() {
        return "Smartwatch [model=" + model + ", manufacturer=" + manufacturer + ", hasTouchScreen=" + hasTouchScreen + "]";
    }
}