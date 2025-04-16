package com.xworkz.main;

import com.xworkz.internal.Box;
import com.xworkz.internal.Container;

public class ContainerRunner {
    public static void main(String[] args) {
        Container genericContainer = new Container("Generic", 1.0);
        genericContainer.store();
        System.out.println(genericContainer);

        Box cardboardBox = new Box("Cardboard", 5.0, "Rectangular");
        cardboardBox.store();
        cardboardBox.pack();
        System.out.println(cardboardBox);

        Container upcastedBox = new Box("Plastic", 2.5, "Circular");
        upcastedBox.store();
        System.out.println(upcastedBox);
    }
}