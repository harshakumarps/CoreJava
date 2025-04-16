package com.xworkz.internal;

public class Mammal extends LivingBeing {
    protected boolean hasFur;

    public Mammal(String name, int lifeSpan, boolean hasFur) {
        super(name, lifeSpan);
        this.hasFur = hasFur;
    }

    public void nurse() {
        System.out.println(name + " is nursing its young.");
    }

    @Override
    public String toString() {
        return "Mammal [name=" + name + ", lifeSpan=" + lifeSpan + ", hasFur=" + hasFur + "]";
    }
}