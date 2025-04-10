package com.xworkz.external;

import com.xworkz.internal.Occupation;

public class Manager4 {
    public void manage() {
        Occupation occupation = new Occupation();
        System.out.println("Title: " + occupation.getTitle());
        System.out.println("Industry: " + occupation.getIndustry());
        System.out.println("Salary: " + occupation.getSalary());
        System.out.println("Responsibilities: " + occupation.getResponsibilities());
        System.out.println("Years of Experience: " + occupation.getYearsOfExperience());
        System.out.println();
    }
}