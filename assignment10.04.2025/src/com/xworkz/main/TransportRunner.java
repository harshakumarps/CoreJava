// com.xworkz.main.TransportRunner.java
package com.xworkz.main;

import com.xworkz.internal.Bus;
import com.xworkz.internal.Transport;

public class TransportRunner {
    public static void main(String[] args) {
        Transport genericTransport = new Transport("Generic Vehicle");
        genericTransport.move();
        System.out.println(genericTransport);

        Bus cityBus = new Bus("City Bus", 50);
        cityBus.move();
        cityBus.openDoor();
        System.out.println(cityBus);

        Transport upcastedBus = new Bus("School Bus", 30);
        upcastedBus.move();
        System.out.println(upcastedBus);
    }
}