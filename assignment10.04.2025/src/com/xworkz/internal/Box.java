package com.xworkz.internal;

public class Box extends Container {
    protected String shape;

    public Box(String material, double capacity, String shape) {
        super(material, capacity);
        this.shape = shape;
    }

    public void pack() {
        System.out.println("Packing items into a " + shape + " box made of " + material + ".");
    }

    @Override
    public String toString() {
        return "Box [material=" + material + ", capacity=" + capacity + ", shape=" + shape + "]";
    }
}