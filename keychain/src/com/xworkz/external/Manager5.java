package com.xworkz.external;

import com.xworkz.internal.Jet;

public class Manager5 {
    public void manage() {
        Jet jet = new Jet();
        System.out.println("Model: " + jet.getModel());
        System.out.println("Passenger Capacity: " + jet.getPassengerCapacity());
        System.out.println("Max Speed: " + jet.getMaxSpeed());
        System.out.println("Fuel Capacity: " + jet.getFuelCapacity());
        System.out.println("Airline: " + jet.getAirline());
        System.out.println();
    }
}