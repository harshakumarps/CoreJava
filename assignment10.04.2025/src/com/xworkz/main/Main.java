package com.xworkz.main;

import com.xworkz.internal.Animal;
import com.xworkz.internal.Dog;

public class Main {
    public static void main(String[] args) {
        // Create a Base Class instance
        Animal animal1 = new Animal("Mammal", 5);
        animal1.makeSound(); // Calls Animal's makeSound

        // Print the reference of animal1
        System.out.println("Animal1 reference: " + animal1);

        // Create a Subclass instance using Base class as the data type
        Animal animal2 = new Dog("Canis familiaris", 3, "Golden Retriever");
        animal2.makeSound(); // Calls Dog's overridden makeSound (Dynamic Polymorphism)
        // animal2.fetch(); // This line would cause an error

        // Print the reference of animal2
        System.out.println("Animal2 reference: " + animal2);

        // Create a Subclass instance using same data type
        Dog myDog = new Dog("Canis familiaris", 2, "Labrador");
        myDog.makeSound(); // Calls Dog's overridden makeSound
        myDog.fetch();     // Calls Dog's fetch method

        // Print the reference of myDog
        System.out.println("MyDog reference: " + myDog);
    }
}