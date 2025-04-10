package com.xworkz.external;

import com.xworkz.internal.Gym;

public class Manager7 {
    public void manage() {
        Gym gym = new Gym();
        System.out.println("Name: " + gym.getName());
        System.out.println("Address: " + gym.getAddress());
        System.out.println("Number of Members: " + gym.getNumberOfMembers());
        System.out.println("Has Equipment: " + gym.hasEquipment());
        System.out.println("Monthly Fee: " + gym.getMonthlyFee());
        System.out.println();
    }
}