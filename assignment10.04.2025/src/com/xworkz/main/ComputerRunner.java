// com.xworkz.main.ComputerRunner.java
package com.xworkz.main;

import com.xworkz.internal.Computer;
import com.xworkz.internal.Laptop;

public class ComputerRunner {
    public static void main(String[] args) {
        Computer genericComputer = new Computer("Intel Core i5");
        genericComputer.bootUp();
        System.out.println(genericComputer);

        Laptop myLaptop = new Laptop("Intel Core i7", 15.6);
        myLaptop.bootUp();
        myLaptop.openLid();
        System.out.println(myLaptop);

        Computer upcastedLaptop = new Laptop("AMD Ryzen 5", 14.0);
        upcastedLaptop.bootUp();
        System.out.println(upcastedLaptop);
    }
}