package com.xworkz.external;

import com.xworkz.internal.Tank;

public class Manager1 {
    public void manage() {
        Tank tank = new Tank();
        System.out.println("Capacity: " + tank.getCapacity());
        System.out.println("Fuel Type: " + tank.getFuelType());
        System.out.println("Current Level: " + tank.getCurrentLevel());
        System.out.println("Material: " + tank.getMaterial());
        System.out.println("Manufacturer: " + tank.getManufacturer());
        System.out.println();
    }
}