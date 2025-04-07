package com.xworkz.external;

public class Drone {
    public Drone(){
        System.out.println("no-args Drone constructor");
    }

    public void fly(){
        System.out.println("Drone is flying");
    }

    void capture(){
        System.out.println("Capturing aerial shots");
        hover();
    }

    private void hover(){
        System.out.println("Drone is hovering in one position");
    }
}
