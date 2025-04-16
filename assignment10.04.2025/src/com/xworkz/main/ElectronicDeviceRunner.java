package com.xworkz.main;

import com.xworkz.internal.ElectronicDevice;
import com.xworkz.internal.Smartwatch;

public class ElectronicDeviceRunner {
    public static void main(String[] args) {
        ElectronicDevice genericDevice = new ElectronicDevice("Generic", "Unknown");
        genericDevice.powerOn();
        System.out.println(genericDevice);

        Smartwatch appleWatch = new Smartwatch("Series 7", "Apple", true);
        appleWatch.powerOn();
        appleWatch.displayTime();
        System.out.println(appleWatch);

        ElectronicDevice upcastedSmartwatch = new Smartwatch("Galaxy Watch 4", "Samsung", true);
        upcastedSmartwatch.powerOn();
        System.out.println(upcastedSmartwatch);
    }
}