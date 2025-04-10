package com.xworkz.runner;

import com.xworkz.internal.Owner3;
import com.xworkz.external.Manager3;

public class PostOfficeRunner {
    public static void main(String[] args) {
        System.out.println("--- PostOffice  ---");
        Owner3 owner = new Owner3();
        owner.run();
        System.out.println("\n-----------------------\n");
        Manager3 manager = new Manager3();
        manager.manage();
    }
}