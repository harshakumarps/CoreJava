package com.xworkz.internal;

public class Occupation {
    private String title;
    private String industry;
    private double salary;
    private String responsibilities;
    private int yearsOfExperience;

    void setTitle(String title) {
        this.title = title;
    }

    void setIndustry(String industry) {
        this.industry = industry;
    }

    void setSalary(double salary) {
        this.salary = salary;
    }

    void setResponsibilities(String responsibilities) {
        this.responsibilities = responsibilities;
    }

    void setYearsOfExperience(int yearsOfExperience) {
        this.yearsOfExperience = yearsOfExperience;
    }

    public String getTitle() {
        return title;
    }

    public String getIndustry() {
        return industry;
    }

    public double getSalary() {
        return salary;
    }

    public String getResponsibilities() {
        return responsibilities;
    }

    public int getYearsOfExperience() {
        return yearsOfExperience;
    }
}