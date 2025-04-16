// com.xworkz.internal.Bus.java
package com.xworkz.internal;

public class Bus extends Transport {
    private int numberOfSeats;

    public Bus(String type, int numberOfSeats) {
        super(type);
        this.numberOfSeats = numberOfSeats;
    }

    @Override
    public void move() {
        System.out.println("The " + type + " (with " + numberOfSeats + " seats) is transporting passengers.");
    }

    public void openDoor() {
        System.out.println("Bus doors are opening.");
    }

    @Override
    public String toString() {
        return "Bus [type=" + type + ", numberOfSeats=" + numberOfSeats + "]";
    }
}