package com.xworkz.internal;

public class Beverage {
    protected String name;
    protected String liquidType;

    public Beverage(String name, String liquidType) {
        this.name = name;
        this.liquidType = liquidType;
    }

    public void consume() {
        System.out.println("Consuming " + name + ".");
    }

    @Override
    public String toString() {
        return "Beverage [name=" + name + ", liquidType=" + liquidType + "]";
    }
}