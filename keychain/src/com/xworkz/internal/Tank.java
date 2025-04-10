package com.xworkz.internal;

public class Tank {
    private double capacity;
    private String fuelType;
    private double currentLevel;
    private String material;
    private String manufacturer;

    void setCapacity(double capacity) {
        this.capacity = capacity;
    }

    void setFuelType(String fuelType) {
        this.fuelType = fuelType;
    }

    void setCurrentLevel(double currentLevel) {
        this.currentLevel = currentLevel;
    }

    void setMaterial(String material) {
        this.material = material;
    }

    void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    public double getCapacity() {
        return capacity;
    }

    public String getFuelType() {
        return fuelType;
    }

    public double getCurrentLevel() {
        return currentLevel;
    }

    public String getMaterial() {
        return material;
    }

    public String getManufacturer() {
        return manufacturer;
    }
}