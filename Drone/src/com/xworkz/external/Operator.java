package com.xworkz.external;

public class Operator {
    public Operator(){
        System.out.println("Running in Operator");
    }

    public void operate() {
        Drone drone = new Drone();
        drone.capture();
        drone.fly();
    }
}
