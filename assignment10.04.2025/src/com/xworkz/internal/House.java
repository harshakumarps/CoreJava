package com.xworkz.internal;

public class House extends Building {
    int numberOfRooms;

    public House(String material, int numberOfRooms) {
        super(material);
        this.numberOfRooms = numberOfRooms;
    }

    @Override
    public void construct() {
        System.out.println("House with " + numberOfRooms + " rooms is being built.");
    }

    public void liveIn() {
        System.out.println("People live in the house.");
    }
}