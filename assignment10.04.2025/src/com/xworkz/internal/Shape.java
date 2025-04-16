// com.xworkz.internal.Shape.java
package com.xworkz.internal;

public class Shape {
    protected String color;

    public Shape(String color) {
        this.color = color;
    }

    public double area() {
        return 0;
    }

    public void draw() {
        System.out.println("Drawing a shape.");
    }

    @Override
    public String toString() {
        return "Shape [color=" + color + "]";
    }
}