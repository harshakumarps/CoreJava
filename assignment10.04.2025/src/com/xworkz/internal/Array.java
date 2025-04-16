package com.xworkz.internal;

public class Array extends DataStructure {
    protected int capacity;

    public Array(String name, int capacity) {
        super(name);
        this.capacity = capacity;
    }

    public void accessElement(int index) {
        System.out.println("Accessing element at index " + index + " in " + name + " (capacity: " + capacity + ").");
    }

    @Override
    public String toString() {
        return "Array [name=" + name + ", capacity=" + capacity + "]";
    }
}