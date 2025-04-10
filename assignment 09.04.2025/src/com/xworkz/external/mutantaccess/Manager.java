package com.xworkz.external.mutantaccess;

import com.xworkz.internal.Mutant;

public class Manager {
    public void manage() {

        Mutant mutant = new Mutant();


        System.out.println("Mutant Name: " + mutant.getName());
        System.out.println("Power: " + mutant.getPower());
        System.out.println("Strength Level: " + mutant.getStrengthLevel());
        System.out.println("Is Visible: " + mutant.isVisible());
        System.out.println("Age: " + mutant.getAge());
    }
}