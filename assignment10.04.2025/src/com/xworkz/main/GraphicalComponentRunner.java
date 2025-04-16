package com.xworkz.main;

import com.xworkz.internal.Button;
import com.xworkz.internal.GraphicalComponent;

public class GraphicalComponentRunner {
    public static void main(String[] args) {
        GraphicalComponent genericComponent = new GraphicalComponent(10, 20);
        genericComponent.draw();
        System.out.println(genericComponent);

        Button submitButton = new Button(50, 100, "Submit");
        submitButton.draw();
        submitButton.onClick();
        System.out.println(submitButton);

        GraphicalComponent upcastedButton = new Button(150, 200, "Cancel");
        upcastedButton.draw();
        System.out.println(upcastedButton);
    }
}