package com.xworkz.runner;

import com.xworkz.internal.Owner7;
import com.xworkz.external.Manager7;

public class GymRunner {
    public static void main(String[] args) {
        System.out.println("--- Gym ---");
        Owner7 owner1 = new Owner7();
        owner1.run();
        System.out.println("\n-----------------------\n");
        Manager7 manager1 = new Manager7();
        manager1.manage();
    }
}