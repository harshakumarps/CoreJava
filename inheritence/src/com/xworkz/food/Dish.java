package com.xworkz.food;

public class Dish {
    protected Dish() {
        System.out.println("Dish is the base class.");
    }

    public void serve() {
        System.out.println("Dishes are served for meals.");
    }
}
