package com.xworkz.internal;

public class Food {
    protected String name;
    protected String taste;

    public Food(String name, String taste) {
        this.name = name;
        this.taste = taste;
    }

    public void describe() {
        System.out.println(name + " tastes " + taste + ".");
    }

    @Override
    public String toString() {
        return "Food [name=" + name + ", taste=" + taste + "]";
    }
}