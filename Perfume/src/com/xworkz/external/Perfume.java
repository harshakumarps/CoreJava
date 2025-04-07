package com.xworkz.external;

public class Perfume {
    public Perfume(){
        System.out.println("no-args Perfume constructor");
    }

    public void spray(){
        System.out.println("Spraying perfume");
    }

    void openCap(){
        System.out.println("Opening perfume cap");
        inhale();
    }

    private void inhale(){
        System.out.println("Inhaling pleasant smell");
    }
}
