package com.xworkz.internal;

public class Owner {
    public void run() {
        KeyChain keyChain = new KeyChain();
        keyChain.setNumberOfKeys(3);
        keyChain.setMaterial("Leather");
        keyChain.setColor("Brown");
        keyChain.setHasCharm(true);
        keyChain.setBrand("Generic");

        System.out.println("Number of Keys: " + keyChain.getNumberOfKeys());
        System.out.println("Material: " + keyChain.getMaterial());
        System.out.println("Color: " + keyChain.getColor());
        System.out.println("Has Charm: " + keyChain.hasCharm());
        System.out.println("Brand: " + keyChain.getBrand());
        System.out.println();
    }
}