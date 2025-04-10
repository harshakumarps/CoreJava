package com.xworkz.internal;

public class Apartment {
    private int unitNumber;
    private int numberOfBedrooms;
    private double rent;
    private boolean isOccupied;
    private String tenantName;

    void setUnitNumber(int unitNumber) {
        this.unitNumber = unitNumber;
    }

    void setNumberOfBedrooms(int numberOfBedrooms) {
        this.numberOfBedrooms = numberOfBedrooms;
    }

    void setRent(double rent) {
        this.rent = rent;
    }

    void setOccupied(boolean occupied) {
        isOccupied = occupied;
    }

    void setTenantName(String tenantName) {
        this.tenantName = tenantName;
    }

    public int getUnitNumber() {
        return unitNumber;
    }

    public int getNumberOfBedrooms() {
        return numberOfBedrooms;
    }

    public double getRent() {
        return rent;
    }

    public boolean isOccupied() {
        return isOccupied;
    }

    public String getTenantName() {
        return tenantName;
    }
}