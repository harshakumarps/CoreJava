package com.xworkz.external;

public class Makeup {
    public Makeup(){
        System.out.println("Running in Makeup");
    }

    public void beautify() {
        Powder powder = new Powder();
        powder.sprinkle();
        powder.apply();
    }
}
