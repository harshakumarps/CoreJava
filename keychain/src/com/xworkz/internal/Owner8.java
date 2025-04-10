package com.xworkz.internal;

public class Owner8 {
    public void run() {
        Apartment apartment = new Apartment();
        apartment.setUnitNumber(101);
        apartment.setNumberOfBedrooms(2);
        apartment.setRent(1500.0);
        apartment.setOccupied(true);
        apartment.setTenantName("John Doe");

        System.out.println("Unit Number: " + apartment.getUnitNumber());
        System.out.println("Number of Bedrooms: " + apartment.getNumberOfBedrooms());
        System.out.println("Rent: " + apartment.getRent());
        System.out.println("Is Occupied: " + apartment.isOccupied());
        System.out.println("Tenant Name: " + apartment.getTenantName());
        System.out.println();
    }
}