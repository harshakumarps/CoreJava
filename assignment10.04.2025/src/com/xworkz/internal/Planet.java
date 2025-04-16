package com.xworkz.internal;

public class Planet extends CelestialBody {
    protected boolean hasAtmosphere;

    public Planet(String name, double mass, boolean hasAtmosphere) {
        super(name, mass);
        this.hasAtmosphere = hasAtmosphere;
    }

    public void orbit() {
        System.out.println(name + " is orbiting its star.");
    }

    @Override
    public String toString() {
        return "Planet [name=" + name + ", mass=" + mass + ", hasAtmosphere=" + hasAtmosphere + "]";
    }
}