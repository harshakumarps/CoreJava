package com.xworkz.internal;

public class Truck extends Vehicle {
    private double cargoCapacity;

    public Truck(String model, String fuelType, double cargoCapacity) {
        super(model, fuelType);
        this.cargoCapacity = cargoCapacity;
    }

    @Override
    public void start() {
        System.out.println(model + " (Truck) is starting its powerful engine.");
    }

    public void loadCargo(double weight) {
        System.out.println("Loading " + weight + " tons of cargo onto " + model + ".");
    }

    @Override
    public String toString() {
        return "Truck [model=" + model + ", fuelType=" + fuelType + ", cargoCapacity=" + cargoCapacity + "]";
    }
}