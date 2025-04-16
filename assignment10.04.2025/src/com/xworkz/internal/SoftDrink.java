package com.xworkz.internal;

public class SoftDrink extends Beverage {
    protected boolean isCarbonated;

    public SoftDrink(String name, String liquidType, boolean isCarbonated) {
        super(name, liquidType);
        this.isCarbonated = isCarbonated;
    }

    public void fizz() {
        if (isCarbonated) {
            System.out.println(name + " is fizzing.");
        } else {
            System.out.println(name + " is not carbonated.");
        }
    }

    @Override
    public String toString() {
        return "SoftDrink [name=" + name + ", liquidType=" + liquidType + ", isCarbonated=" + isCarbonated + "]";
    }
}