package com.xworkz.internal;

public class Owner6 {
    public void run() {
        Garage garage = new Garage();
        garage.setCapacity(2);
        garage.setLocation("Main House");
        garage.setAttached(true);
        garage.setWidth(20.0);
        garage.setLength(25.0);

        System.out.println("Capacity: " + garage.getCapacity());
        System.out.println("Location: " + garage.getLocation());
        System.out.println("Is Attached: " + garage.isAttached());
        System.out.println("Width: " + garage.getWidth());
        System.out.println("Length: " + garage.getLength());
        System.out.println();
    }
}