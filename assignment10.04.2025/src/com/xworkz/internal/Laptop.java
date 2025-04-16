// com.xworkz.internal.Laptop.java
package com.xworkz.internal;

public class Laptop extends Computer {
    private double screenSize;

    public Laptop(String processor, double screenSize) {
        super(processor);
        this.screenSize = screenSize;
    }

    @Override
    public void bootUp() {
        System.out.println("Laptop is starting the operating system.");
    }

    public void openLid() {
        System.out.println("Laptop lid opened.");
    }

    @Override
    public String toString() {
        return "Laptop [processor=" + processor + ", screenSize=" + screenSize + "]";
    }
}