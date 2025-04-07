package com.xworkz.external;

public class Stylist {
    public Stylist(){
        System.out.println("Running in Stylist");
    }

    public void present() {
        Perfume perfume = new Perfume();
        perfume.openCap();
        perfume.spray();
    }
}
