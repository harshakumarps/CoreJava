package com.xworkz.internal;

public class StringInstrument extends MusicalInstrument {
    protected int numberOfStrings;

    public StringInstrument(String name, String family, int numberOfStrings) {
        super(name, family);
        this.numberOfStrings = numberOfStrings;
    }

    public void pluck() {
        System.out.println(name + " is being plucked.");
    }

    @Override
    public String toString() {
        return "StringInstrument [name=" + name + ", family=" + family + ", numberOfStrings=" + numberOfStrings + "]";
    }
}