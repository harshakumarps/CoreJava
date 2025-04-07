package com.xworkz.external;

public class Groom {
    public Groom(){
        System.out.println("Running in Groom");
    }

    public void style() {
        Comb comb = new Comb();
        comb.untangle();
        comb.smoothen();
    }
}
