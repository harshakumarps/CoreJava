package com.xworkz.runner;

import com.xworkz.internal.Owner4;
import com.xworkz.external.Manager4;

public class OccupationRunner {
    public static void main(String[] args) {
        System.out.println("--- Occupation  ---");
        Owner4 owner1 = new Owner4();
        owner1.run();
        System.out.println("\n-----------------------\n");
        Manager4 manager1 = new Manager4();
        manager1.manage();
    }
}