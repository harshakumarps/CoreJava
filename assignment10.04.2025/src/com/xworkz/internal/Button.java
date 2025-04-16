package com.xworkz.internal;

public class Button extends GraphicalComponent {
    protected String label;

    public Button(int x, int y, String label) {
        super(x, y);
        this.label = label;
    }

    public void onClick() {
        System.out.println("Button '" + label + "' clicked.");
    }

    @Override
    public void draw() {
        System.out.println("Drawing button '" + label + "' at (" + x + ", " + y + ").");
    }

    @Override
    public String toString() {
        return "Button [x=" + x + ", y=" + y + ", label=" + label + "]";
    }
}