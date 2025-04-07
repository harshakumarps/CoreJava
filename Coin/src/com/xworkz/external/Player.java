package com.xworkz.external;

public class Player {
    public Player(){
        System.out.println("Running in Player");
    }

    public void match() {
        Coin coin = new Coin();
        coin.flip();
        coin.toss();
    }
}
