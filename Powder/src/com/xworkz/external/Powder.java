package com.xworkz.external;

public class Powder {
    public Powder(){
        System.out.println("no-args Powder constructor");
    }

    public void apply(){
        System.out.println("Applying powder");
    }

    void sprinkle(){
        System.out.println("Sprinkling powder");
        scent();
    }

    private void scent(){
        System.out.println("Smelling fragrance of powder");
    }
}
