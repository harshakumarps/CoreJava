package com.xworkz.internal;

public class Owner3 {
    public void run() {
        PostOffice postOffice = new PostOffice();
        postOffice.setName("Main Post Office");
        postOffice.setAddress("123 Main St");
        postOffice.setZipCode(12345);
        postOffice.setNumberOfEmployees(20);
        postOffice.setOpen(true);

        System.out.println("Name: " + postOffice.getName());
        System.out.println("Address: " + postOffice.getAddress());
        System.out.println("Zip Code: " + postOffice.getZipCode());
        System.out.println("Number of Employees: " + postOffice.getNumberOfEmployees());
        System.out.println("Is Open: " + postOffice.isOpen());
        System.out.println();
    }
}