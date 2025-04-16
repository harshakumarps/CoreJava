package com.xworkz.internal;

public class Dog extends Animal {
    private String breed;

    public Dog(String species, int age, String breed) {
        super(species, age);
        this.breed = breed;
    }

    public Dog() {
        super("Canis familiaris", 1);
        this.breed = "Mixed";
    }

    // Overriding the makeSound from Animal class
    @Override
    public void makeSound() {
        System.out.println("Woof!");
    }

    // Override toString method
    @Override
    public String toString() {
        return "Dog [species=" + species + ", age=" + age + ", breed=" + breed + "]";
    }

    // Additional method specific to Dog
    public void fetch() {
        System.out.println("Dog is fetching the ball");
    }
}
