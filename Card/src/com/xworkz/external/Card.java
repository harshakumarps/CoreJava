package com.xworkz.external;

public class Card {
    public Card(){
        System.out.println("no-args Card constructor");
    }

    public void swipe(){
        System.out.println("Swiping the card");
    }

    void insert(){
        System.out.println("Inserting card into machine");
        verify();
    }

    private void verify(){
        System.out.println("Verifying card details");
    }
}
