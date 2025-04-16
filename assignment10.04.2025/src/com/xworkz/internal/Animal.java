package com.xworkz.internal;

public class Animal {
    // Two variables in parent class
    protected String species;
    protected int age;

    // Constructor to initialize variables
    public Animal(String species, int age) {
        this.species = species;
        this.age = age;
    }

    // Default constructor
    public Animal() {
        this.species = "Unknown";
        this.age = 0;
    }

    // Common method present in all base classes
    public void makeSound() {
        System.out.println("Generic animal sound");
    }

    // Override toString method
    @Override
    public String toString() {
        return "Animal [species=" + species + ", age=" + age + "]";
    }
}
