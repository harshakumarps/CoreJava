package com.xworkz.food;

public class Food {
    protected Food() {
        System.out.println("Food is the base class.");
    }

    public void type() {
        System.out.println("Type: Edible item");
    }
}
