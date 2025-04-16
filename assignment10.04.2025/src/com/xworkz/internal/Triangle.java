// com.xworkz.internal.Triangle.java
package com.xworkz.internal;

public class Triangle extends Shape {
    private double base;
    private double height;

    public Triangle(String color, double base, double height) {
        super(color);
        this.base = base;
        this.height = height;
    }

    @Override
    public double area() {
        return 0.5 * base * height;
    }

    @Override
    public void draw() {
        System.out.println("Drawing a triangle with base " + base + " and height " + height + ".");
    }

    public double perimeter(double side1, double side2) {
        return base + side1 + side2;
    }

    @Override
    public String toString() {
        return "Triangle [color=" + color + ", base=" + base + ", height=" + height + "]";
    }
}