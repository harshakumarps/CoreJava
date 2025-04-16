// com.xworkz.internal.Plant.java
package com.xworkz.internal;

public class Plant {
    protected String name;

    public Plant(String name) {
        this.name = name;
    }

    public void grow() {
        System.out.println(name + " is growing.");
    }

    @Override
    public String toString() {
        return "Plant [name=" + name + "]";
    }
}