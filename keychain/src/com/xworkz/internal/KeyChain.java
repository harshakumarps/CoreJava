package com.xworkz.internal;

public class KeyChain {
    private int numberOfKeys;
    private String material;
    private String color;
    private boolean hasCharm;
    private String brand;

    void setNumberOfKeys(int numberOfKeys) {
        this.numberOfKeys = numberOfKeys;
    }

    void setMaterial(String material) {
        this.material = material;
    }

    void setColor(String color) {
        this.color = color;
    }

    void setHasCharm(boolean hasCharm) {
        this.hasCharm = hasCharm;
    }

    void setBrand(String brand) {
        this.brand = brand;
    }

    public int getNumberOfKeys() {
        return numberOfKeys;
    }

    public String getMaterial() {
        return material;
    }

    public String getColor() {
        return color;
    }

    public boolean hasCharm() {
        return hasCharm;
    }

    public String getBrand() {
        return brand;
    }
}