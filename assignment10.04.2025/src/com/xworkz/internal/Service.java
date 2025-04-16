package com.xworkz.internal;

public class Service {
    protected String name;

    public Service(String name) {
        this.name = name;
    }

    public void start() {
        System.out.println("Starting service: " + name + ".");
    }

    @Override
    public String toString() {
        return "Service [name=" + name + "]";
    }
}