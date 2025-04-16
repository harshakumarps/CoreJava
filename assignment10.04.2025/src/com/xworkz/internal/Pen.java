package com.xworkz.internal;

public class Pen extends WritingTool {
    protected String inkColor;

    public Pen(String type, String color, String inkColor) {
        super(type, color);
        this.inkColor = inkColor;
    }

    public void refill() {
        System.out.println("Refilling the " + color + " pen with " + inkColor + " ink.");
    }

    @Override
    public void write() {
        System.out.println("Writing with a " + color + " " + type + " using " + inkColor + " ink.");
    }

    @Override
    public String toString() {
        return "Pen [type=" + type + ", color=" + color + ", inkColor=" + inkColor + "]";
    }
}