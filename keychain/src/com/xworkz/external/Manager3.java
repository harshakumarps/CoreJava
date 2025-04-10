package com.xworkz.external;

import com.xworkz.internal.PostOffice;

public class Manager3 {
    public void manage() {
        PostOffice postOffice = new PostOffice();
        System.out.println("Name: " + postOffice.getName());
        System.out.println("Address: " + postOffice.getAddress());
        System.out.println("Zip Code: " + postOffice.getZipCode());
        System.out.println("Number of Employees: " + postOffice.getNumberOfEmployees());
        System.out.println("Is Open: " + postOffice.isOpen());
        System.out.println();
    }
}