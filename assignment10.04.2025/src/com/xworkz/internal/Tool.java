package com.xworkz.internal;

public class Tool {
    protected String name;
    protected String purpose;

    public Tool(String name, String purpose) {
        this.name = name;
        this.purpose = purpose;
    }

    public void use() {
        System.out.println("Using " + name + " for " + purpose + ".");
    }

    @Override
    public String toString() {
        return "Tool [name=" + name + ", purpose=" + purpose + "]";
    }
}