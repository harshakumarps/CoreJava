package com.xworkz.main;

import com.xworkz.internal.LivingBeing;
import com.xworkz.internal.Mammal;

public class LivingBeingRunner {
    public static void main(String[] args) {
        LivingBeing genericBeing = new LivingBeing("Generic", 10);
        genericBeing.breathe();
        System.out.println(genericBeing);

        Mammal cat = new Mammal("Whiskers", 15, true);
        cat.breathe();
        cat.nurse();
        System.out.println(cat);

        LivingBeing upcastedMammal = new Mammal("Elephant", 70, false);
        upcastedMammal.breathe();
        System.out.println(upcastedMammal);
    }
}