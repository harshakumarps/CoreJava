package com.xworkz.external;

public class Banker {
    public Banker(){
        System.out.println("Running in Banker");
    }

    public void transaction() {
        Card card = new Card();
        card.insert();
        card.swipe();
    }
}
