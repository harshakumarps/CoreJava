package com.xworkz.internal;

public class Owner4 {
    public void run() {
        Occupation occupation = new Occupation();
        occupation.setTitle("Software Engineer");
        occupation.setIndustry("Technology");
        occupation.setSalary(120000.0);
        occupation.setResponsibilities("Coding, Testing, Deployment");
        occupation.setYearsOfExperience(5);

        System.out.println("Title: " + occupation.getTitle());
        System.out.println("Industry: " + occupation.getIndustry());
        System.out.println("Salary: " + occupation.getSalary());
        System.out.println("Responsibilities: " + occupation.getResponsibilities());
        System.out.println("Years of Experience: " + occupation.getYearsOfExperience());
        System.out.println();
    }
}