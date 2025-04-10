package main;

import com.xworkz.food.Omlet;

public class OmletRunner {
    public static void main(String[] args) {
        Omlet omlet = new Omlet();
        omlet.serve();
        omlet.usuallyServedWith();
        omlet.ingredients();
    }
}
