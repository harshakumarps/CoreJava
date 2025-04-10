package com.xworkz.internal;

public class Garage {
    private int capacity;
    private String location;
    private boolean isAttached;
    private double width;
    private double length;

    void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    void setLocation(String location) {
        this.location = location;
    }

    void setAttached(boolean attached) {
        isAttached = attached;
    }

    void setWidth(double width) {
        this.width = width;
    }

    void setLength(double length) {
        this.length = length;
    }

    public int getCapacity() {
        return capacity;
    }

    public String getLocation() {
        return location;
    }

    public boolean isAttached() {
        return isAttached;
    }

    public double getWidth() {
        return width;
    }

    public double getLength() {
        return length;
    }
}