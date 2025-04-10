package com.xworkz.internal;

public class Owner7 {
    public void run() {
        Gym gym = new Gym();
        gym.setName("Fitness First");
        gym.setAddress("456 Elm St");
        gym.setNumberOfMembers(300);
        gym.setHasEquipment(true);
        gym.setMonthlyFee(50.0);

        System.out.println("Name: " + gym.getName());
        System.out.println("Address: " + gym.getAddress());
        System.out.println("Number of Members: " + gym.getNumberOfMembers());
        System.out.println("Has Equipment: " + gym.hasEquipment());
        System.out.println("Monthly Fee: " + gym.getMonthlyFee());
        System.out.println();
    }
}