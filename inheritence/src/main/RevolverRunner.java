package main;

import com.xworkz.defense.Revolver;

public class RevolverRunner {
    public static void main(String[] args) {
        Revolver revolver = new Revolver();
        revolver.use();
        revolver.attack();
        revolver.shoot();
    }
}
