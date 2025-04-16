package com.xworkz.main;

import com.xworkz.internal.Food;
import com.xworkz.internal.Fruit;

public class FoodRunner {
    public static void main(String[] args) {
        Food genericFood = new Food("Generic Food", "bland");
        genericFood.describe();
        System.out.println(genericFood);

        Fruit apple = new Fruit("Apple", "sweet and crisp", "red", true);
        apple.describe();
        apple.eat();
        System.out.println(apple);

        Food upcastedFruit = new Fruit("Lemon", "sour", "yellow", false);
        upcastedFruit.describe();
        System.out.println(upcastedFruit);
    }
}