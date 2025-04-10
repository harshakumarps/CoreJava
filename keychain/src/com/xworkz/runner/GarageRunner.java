package com.xworkz.runner;

import com.xworkz.internal.Owner6;
import com.xworkz.external.Manager6;

public class GarageRunner {
    public static void main(String[] args) {
        System.out.println("--- Garage ---");
        Owner6 owner1 = new Owner6();
        owner1.run();
        System.out.println("\n-----------------------\n");
        Manager6 manager1 = new Manager6();
        manager1.manage();
    }
}