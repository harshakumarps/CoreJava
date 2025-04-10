package com.xworkz.runner;

import com.xworkz.internal.Owner5;
import com.xworkz.external.Manager5;

public class JetRunner {
    public static void main(String[] args) {
        System.out.println("--- Jet  ---");
        Owner5 owner1 = new Owner5();
        owner1.run();
        System.out.println("\n-----------------------\n");
        Manager5 manager1 = new Manager5();
        manager1.manage();
    }
}