package com.xworkz.main;

import com.xworkz.internal.CelestialBody;
import com.xworkz.internal.Planet;

public class CelestialBodyRunner {
    public static void main(String[] args) {
        CelestialBody genericBody = new CelestialBody("Generic", 1.0e20);
        genericBody.exertGravity();
        System.out.println(genericBody);

        Planet earth = new Planet("Earth", 5.97e24, true);
        earth.exertGravity();
        earth.orbit();
        System.out.println(earth);

        CelestialBody upcastedPlanet = new Planet("Mars", 6.39e23, true);
        upcastedPlanet.exertGravity();
        System.out.println(upcastedPlanet);
    }
}