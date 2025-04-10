package com.xworkz.runner;

import com.xworkz.internal.Owner;
import com.xworkz.external.mutantaccess.Manager;

public class MutantRunner {
    public static void main(String[] args) {

        Owner owner = new Owner();
        owner.run();

        System.out.println("\n-----------------------\n");


        Manager manager = new Manager();
        manager.manage();
    }
}