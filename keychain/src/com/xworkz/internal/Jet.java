package com.xworkz.internal;

public class Jet {
    private String model;
    private int passengerCapacity;
    private double maxSpeed;
    private double fuelCapacity;
    private String airline;

    void setModel(String model) {
        this.model = model;
    }

    void setPassengerCapacity(int passengerCapacity) {
        this.passengerCapacity = passengerCapacity;
    }

    void setMaxSpeed(double maxSpeed) {
        this.maxSpeed = maxSpeed;
    }

    void setFuelCapacity(double fuelCapacity) {
        this.fuelCapacity = fuelCapacity;
    }

    void setAirline(String airline) {
        this.airline = airline;
    }

    public String getModel() {
        return model;
    }

    public int getPassengerCapacity() {
        return passengerCapacity;
    }

    public double getMaxSpeed() {
        return maxSpeed;
    }

    public double getFuelCapacity() {
        return fuelCapacity;
    }

    public String getAirline() {
        return airline;
    }
}