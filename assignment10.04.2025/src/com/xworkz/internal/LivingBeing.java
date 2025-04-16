package com.xworkz.internal;

public class LivingBeing {
    protected String name;
    protected int lifeSpan;

    public LivingBeing(String name, int lifeSpan) {
        this.name = name;
        this.lifeSpan = lifeSpan;
    }

    public void breathe() {
        System.out.println(name + " is breathing.");
    }

    @Override
    public String toString() {
        return "LivingBeing [name=" + name + ", lifeSpan=" + lifeSpan + "]";
    }
}