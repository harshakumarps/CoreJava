package com.xworkz.external;

public class Forest {
    public Forest(){
        System.out.println("no-args Forest constructor");
    }

    public void explore(){
        System.out.println("Exploring the forest");
    }

    void walk(){
        System.out.println("Walking inside dense forest");
        observe();
    }

    private void observe(){
        System.out.println("Observing wildlife and plants");
    }
}
