package com.xworkz.runner;

import com.xworkz.internal.Owner8;
import com.xworkz.external.Manager8;

public class ApartmentRunner {
    public static void main(String[] args) {
        System.out.println("--- Apartment  ---");
        Owner8 owner1 = new Owner8();
        owner1.run();
        System.out.println("\n-----------------------\n");
        Manager8 manager1 = new Manager8();
        manager1.manage();
    }
}