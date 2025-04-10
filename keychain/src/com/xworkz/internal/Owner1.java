package com.xworkz.internal;

public class Owner1 {
    public void run() {
        Tank tank = new Tank();
        tank.setCapacity(50.0);
        tank.setFuelType("Gasoline");
        tank.setCurrentLevel(35.5);
        tank.setMaterial("Steel");
        tank.setManufacturer("Acme Tanks");

        System.out.println("Capacity: " + tank.getCapacity());
        System.out.println("Fuel Type: " + tank.getFuelType());
        System.out.println("Current Level: " + tank.getCurrentLevel());
        System.out.println("Material: " + tank.getMaterial());
        System.out.println("Manufacturer: " + tank.getManufacturer());
        System.out.println();
    }
}