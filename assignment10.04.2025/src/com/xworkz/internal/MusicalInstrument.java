package com.xworkz.internal;

public class MusicalInstrument {
    protected String name;
    protected String family;

    public MusicalInstrument(String name, String family) {
        this.name = name;
        this.family = family;
    }

    public void play() {
        System.out.println(name + " is playing.");
    }

    @Override
    public String toString() {
        return "MusicalInstrument [name=" + name + ", family=" + family + "]";
    }
}