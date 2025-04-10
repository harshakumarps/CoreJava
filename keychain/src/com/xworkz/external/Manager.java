package com.xworkz.external;

import com.xworkz.internal.KeyChain;

public class Manager {
    public void manage() {
        KeyChain keyChain = new KeyChain();
        System.out.println("Number of Keys: " + keyChain.getNumberOfKeys());
        System.out.println("Material: " + keyChain.getMaterial());
        System.out.println("Color: " + keyChain.getColor());
        System.out.println("Has Charm: " + keyChain.hasCharm());
        System.out.println("Brand: " + keyChain.getBrand());
        System.out.println();
    }
}