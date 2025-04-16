package com.xworkz.main;

import com.xworkz.internal.Truck;
import com.xworkz.internal.Vehicle;

public class VehicleRunner {
    public static void main(String[] args) {
        Vehicle genericVehicle = new Vehicle("Generic Vehicle", "Diesel");
        genericVehicle.start();
        System.out.println(genericVehicle);

        Truck myTruck = new Truck("Ford F-150", "Gasoline", 1.5);
        myTruck.start();
        myTruck.loadCargo(1.2);
        System.out.println(myTruck);

        Vehicle upcastedTruck = new Truck("Volvo FH16", "Diesel", 20.0);
        upcastedTruck.start();
        System.out.println(upcastedTruck);
    }
}