package com.xworkz.external;

public class Comb {
    public Comb(){
        System.out.println("no-args Comb constructor");
    }

    public void smoothen(){
        System.out.println("Smoothing the hair");
    }

    void untangle(){
        System.out.println("Untangling hair strands");
        clean();
    }

    private void clean(){
        System.out.println("Cleaning the comb");
    }
}
