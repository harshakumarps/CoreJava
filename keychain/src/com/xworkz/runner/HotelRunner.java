package com.xworkz.runner;

import com.xworkz.internal.Owner2;
import com.xworkz.external.Manager2;

public class HotelRunner {
    public static void main(String[] args) {
        System.out.println("--- Hotel  ---");
        Owner2 owner1 = new Owner2();
        owner1.run();
        System.out.println("\n-----------------------\n");
        Manager2 manager1 = new Manager2();
        manager1.manage();
    }
}