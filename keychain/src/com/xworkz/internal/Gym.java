package com.xworkz.internal;

public class Gym {
    private String name;
    private String address;
    private int numberOfMembers;
    private boolean hasEquipment;
    private double monthlyFee;

    void setName(String name) {
        this.name = name;
    }

    void setAddress(String address) {
        this.address = address;
    }

    void setNumberOfMembers(int numberOfMembers) {
        this.numberOfMembers = numberOfMembers;
    }

    void setHasEquipment(boolean hasEquipment) {
        this.hasEquipment = hasEquipment;
    }

    void setMonthlyFee(double monthlyFee) {
        this.monthlyFee = monthlyFee;
    }

    public String getName() {
        return name;
    }

    public String getAddress() {
        return address;
    }

    public int getNumberOfMembers() {
        return numberOfMembers;
    }

    public boolean hasEquipment() {
        return hasEquipment;
    }

    public double getMonthlyFee() {
        return monthlyFee;
    }
}