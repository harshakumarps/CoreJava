package com.xworkz.external;

public class Beach {

    public Beach() {
        System.out.println("No-args Beach constructor");
    }

    public void walk() {
        System.out.println("Walking along the beach");
    }

    void sunBath() {
        System.out.println("Sunbathing on the beach");
        collectShells();
    }

    private void collectShells() {
        System.out.println("Collecting shells on the beach");
    }
}
