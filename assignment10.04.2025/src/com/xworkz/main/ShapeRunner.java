// com.xworkz.main.ShapeRunner.java
package com.xworkz.main;

import com.xworkz.internal.Shape;
import com.xworkz.internal.Triangle;

public class ShapeRunner {
    public static void main(String[] args) {
        Shape genericShape = new Shape("Blue");
        genericShape.draw();
        System.out.println(genericShape);

        Triangle rightTriangle = new Triangle("Green", 5, 8);
        rightTriangle.draw();
        System.out.println("Area: " + rightTriangle.area());
        System.out.println(rightTriangle);

        Shape upcastedTriangle = new Triangle("Yellow", 3, 4);
        upcastedTriangle.draw();
        System.out.println("Area: " + upcastedTriangle.area());
        System.out.println(upcastedTriangle);
    }
}