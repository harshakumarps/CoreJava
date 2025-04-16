package com.xworkz.internal;

public class HandTool extends Tool {
    protected boolean isManual;

    public HandTool(String name, String purpose, boolean isManual) {
        super(name, purpose);
        this.isManual = isManual;
    }

    public void operateManually() {
        if (isManual) {
            System.out.println("Operating " + name + " manually.");
        } else {
            System.out.println(name + " is not a manual tool.");
        }
    }

    @Override
    public String toString() {
        return "HandTool [name=" + name + ", purpose=" + purpose + ", isManual=" + isManual + "]";
    }
}