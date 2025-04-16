package com.xworkz.internal;

public class Building {
    String material;

    public Building(String material) {
        this.material = material;
    }

    public void construct() {
        System.out.println("Building is being constructed.");
    }
}