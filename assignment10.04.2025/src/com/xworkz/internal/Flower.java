// com.xworkz.internal.Flower.java
package com.xworkz.internal;

public class Flower extends Plant {
    private String color;

    public Flower(String name, String color) {
        super(name);
        this.color = color;
    }

    @Override
    public void grow() {
        System.out.println(name + " is blooming with " + color + " petals.");
    }

    public void smell() {
        System.out.println("The " + name + " smells lovely.");
    }

    @Override
    public String toString() {
        return "Flower [name=" + name + ", color=" + color + "]";
    }
}