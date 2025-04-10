package com.xworkz.fabric;

public class Material {
    protected Material() {
        System.out.println("Material is the base class.");
    }

    public void property() {
        System.out.println("Materials have physical properties like texture, color, strength.");
    }
}
