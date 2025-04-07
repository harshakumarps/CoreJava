package com.xworkz.external;

public class Tourist {
    public Tourist() {
        System.out.println("Running in Tourist");
    }

    public void enjoy() {
        Beach beach = new Beach();
        beach.sunBath();
        beach.walk();
    }
}
