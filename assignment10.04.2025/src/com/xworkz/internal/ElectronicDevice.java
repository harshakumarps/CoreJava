package com.xworkz.internal;

public class ElectronicDevice {
    protected String model;
    protected String manufacturer;

    public ElectronicDevice(String model, String manufacturer) {
        this.model = model;
        this.manufacturer = manufacturer;
    }

    public void powerOn() {
        System.out.println(model + " by " + manufacturer + " is powering on.");
    }

    @Override
    public String toString() {
        return "ElectronicDevice [model=" + model + ", manufacturer=" + manufacturer + "]";
    }
}