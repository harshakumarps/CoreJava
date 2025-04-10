package com.xworkz.internal;

public class PostOffice {
    private String name;
    private String address;
    private int zipCode;
    private int numberOfEmployees;
    private boolean isOpen;

    void setName(String name) {
        this.name = name;
    }

    void setAddress(String address) {
        this.address = address;
    }

    void setZipCode(int zipCode) {
        this.zipCode = zipCode;
    }

    void setNumberOfEmployees(int numberOfEmployees) {
        this.numberOfEmployees = numberOfEmployees;
    }

    void setOpen(boolean open) {
        isOpen = open;
    }

    public String getName() {
        return name;
    }

    public String getAddress() {
        return address;
    }

    public int getZipCode() {
        return zipCode;
    }

    public int getNumberOfEmployees() {
        return numberOfEmployees;
    }

    public boolean isOpen() {
        return isOpen;
    }
}