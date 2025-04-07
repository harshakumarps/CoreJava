package com.xworkz.external;

public class Coin {
    public Coin(){
        System.out.println("no-args Coin constructor");
    }

    public void toss(){
        System.out.println("Tossing the coin");
    }

    void flip(){
        System.out.println("Flipping...");
        side();
    }

    private void side(){
        System.out.println("Showing heads/tails");
    }
}
