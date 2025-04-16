package com.xworkz.internal;

public class WritingTool {
    protected String type;
    protected String color;

    public WritingTool(String type, String color) {
        this.type = type;
        this.color = color;
    }

    public void write() {
        System.out.println("Writing with a " + color + " " + type + ".");
    }

    @Override
    public String toString() {
        return "WritingTool [type=" + type + ", color=" + color + "]";
    }
}