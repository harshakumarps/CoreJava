package com.xworkz.main;

import com.xworkz.internal.Device;
import com.xworkz.internal.Tablet;

public class DeviceRunner {
    public static void main(String[] args) {
        Device genericDevice = new Device("Generic", "Device");
        genericDevice.turnOn();
        System.out.println(genericDevice);

        Tablet iPad = new Tablet("Apple", "iPad Pro", 12.9, true);
        iPad.turnOn();
        iPad.draw();
        System.out.println(iPad);

        Device upcastedTablet = new Tablet("Samsung", "Galaxy Tab S8", 11.0, false);
        upcastedTablet.turnOn();
        System.out.println(upcastedTablet);
    }
}

