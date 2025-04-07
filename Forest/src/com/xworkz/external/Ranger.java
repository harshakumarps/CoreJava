package com.xworkz.external;

public class Ranger {
    public Ranger(){
        System.out.println("Running in Ranger");
    }

    public void patrol() {
        Forest forest = new Forest();
        forest.walk();
        forest.explore();
    }
}
