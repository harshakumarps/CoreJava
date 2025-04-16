package com.xworkz.internal;

public class GraphicalComponent {
    protected int x;
    protected int y;

    public GraphicalComponent(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public void draw() {
        System.out.println("Drawing component at (" + x + ", " + y + ").");
    }

    @Override
    public String toString() {
        return "GraphicalComponent [x=" + x + ", y=" + y + "]";
    }
}