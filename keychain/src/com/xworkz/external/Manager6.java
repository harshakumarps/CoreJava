package com.xworkz.external;

import com.xworkz.internal.Garage;

public class Manager6 {
    public void manage() {
        Garage garage = new Garage();
        System.out.println("Capacity: " + garage.getCapacity());
        System.out.println("Location: " + garage.getLocation());
        System.out.println("Is Attached: " + garage.isAttached());
        System.out.println("Width: " + garage.getWidth());
        System.out.println("Length: " + garage.getLength());
        System.out.println();
    }
}