package com.xworkz.main;

import com.xworkz.internal.Beverage;
import com.xworkz.internal.SoftDrink;

public class BeverageRunner {
    public static void main(String[] args) {
        Beverage genericBeverage = new Beverage("Generic", "Liquid");
        genericBeverage.consume();
        System.out.println(genericBeverage);

        SoftDrink cola = new SoftDrink("Cola", "Liquid", true);
        cola.consume();
        cola.fizz();
        System.out.println(cola);

        Beverage upcastedSoftDrink = new SoftDrink("Juice", "Liquid", false);
        upcastedSoftDrink.consume();
        System.out.println(upcastedSoftDrink);
    }
}