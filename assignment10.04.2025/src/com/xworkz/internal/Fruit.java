package com.xworkz.internal;

public class Fruit extends Food {
    private String color;
    private boolean isSweet;

    public Fruit(String name, String taste, String color, boolean isSweet) {
        super(name, taste);
        this.color = color;
        this.isSweet = isSweet;
    }

    @Override
    public void describe() {
        super.describe();
        System.out.println("It is " + color + " in color and is " + (isSweet ? "sweet" : "not sweet") + ".");
    }

    public void eat() {
        System.out.println("Eating the " + name + ".");
    }

    @Override
    public String toString() {
        return "Fruit [name=" + name + ", taste=" + taste + ", color=" + color + ", isSweet=" + isSweet + "]";
    }
}