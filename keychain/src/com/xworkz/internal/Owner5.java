package com.xworkz.internal;

public class Owner5 {
    public void run() {
        Jet jet = new Jet();
        jet.setModel("Boeing 747");
        jet.setPassengerCapacity(400);
        jet.setMaxSpeed(0.85);
        jet.setFuelCapacity(200000.0);
        jet.setAirline("Global Airlines");

        System.out.println("Model: " + jet.getModel());
        System.out.println("Passenger Capacity: " + jet.getPassengerCapacity());
        System.out.println("Max Speed: " + jet.getMaxSpeed());
        System.out.println("Fuel Capacity: " + jet.getFuelCapacity());
        System.out.println("Airline: " + jet.getAirline());
        System.out.println();
    }
}