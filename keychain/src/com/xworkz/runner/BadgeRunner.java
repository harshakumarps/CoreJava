package com.xworkz.runner;

import com.xworkz.internal.Owner2;
import com.xworkz.external.Manager2;

public class BadgeRunner {
    public static void main(String[] args) {
        System.out.println("--- Badge ---");
        Owner2 owner = new Owner2();
        owner.run();
        System.out.println("\n-----------------------\n");
        Manager2 manager = new Manager2();
        manager.manage();
    }
}