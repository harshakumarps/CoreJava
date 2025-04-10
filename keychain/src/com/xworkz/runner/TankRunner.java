package com.xworkz.runner;

import com.xworkz.internal.Owner1;
import com.xworkz.external.Manager1;

public class TankRunner {
    public static void main(String[] args) {
        System.out.println("--- Tank ---");
        Owner1 owner = new Owner1();
        owner.run();
        System.out.println("\n-----------------------\n");
        Manager1 manager = new Manager1();
        manager.manage();
    }
}