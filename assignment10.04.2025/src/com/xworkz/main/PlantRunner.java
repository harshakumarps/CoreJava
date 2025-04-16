// com.xworkz.main.PlantRunner.java
package com.xworkz.main;

import com.xworkz.internal.Flower;
import com.xworkz.internal.Plant;

public class PlantRunner {
    public static void main(String[] args) {
        Plant genericPlant = new Plant("Generic Plant");
        genericPlant.grow();
        System.out.println(genericPlant);

        Flower rose = new Flower("Rose", "Red");
        rose.grow();
        rose.smell();
        System.out.println(rose);

        Plant upcastedFlower = new Flower("Sunflower", "Yellow");
        upcastedFlower.grow();
        System.out.println(upcastedFlower);
    }
}