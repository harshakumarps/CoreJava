package com.xworkz.internal;

public class Container {
    protected String material;
    protected double capacity;

    public Container(String material, double capacity) {
        this.material = material;
        this.capacity = capacity;
    }

    public void store() {
        System.out.println("Storing items in a " + material + " container.");
    }

    @Override
    public String toString() {
        return "Container [material=" + material + ", capacity=" + capacity + "]";
    }
}