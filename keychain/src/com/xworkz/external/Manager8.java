package com.xworkz.external;

import com.xworkz.internal.Apartment;

public class Manager8 {
    public void manage() {
        Apartment apartment = new Apartment();
        System.out.println("Unit Number: " + apartment.getUnitNumber());
        System.out.println("Number of Bedrooms: " + apartment.getNumberOfBedrooms());
        System.out.println("Rent: " + apartment.getRent());
        System.out.println("Is Occupied: " + apartment.isOccupied());
        System.out.println("Tenant Name: " + apartment.getTenantName());
        System.out.println();
    }
}