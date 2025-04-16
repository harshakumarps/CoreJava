package com.xworkz.internal;

public class CelestialBody {
    protected String name;
    protected double mass;

    public CelestialBody(String name, double mass) {
        this.name = name;
        this.mass = mass;
    }

    public void exertGravity() {
        System.out.println(name + " is exerting gravitational force.");
    }

    @Override
    public String toString() {
        return "CelestialBody [name=" + name + ", mass=" + mass + "]";
    }
}