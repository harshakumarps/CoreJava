package com.xworkz.internal;

public class Owner2 {
    public void run() {
        Badge badge = new Badge();
        badge.setId(12345);
        badge.setName("Alice Smith");
        badge.setRole("Engineer");
        badge.setSecurityLevel("High");
        badge.setActive(true);

        System.out.println("ID: " + badge.getId());
        System.out.println("Name: " + badge.getName());
        System.out.println("Role: " + badge.getRole());
        System.out.println("Security Level: " + badge.getSecurityLevel());
        System.out.println("Is Active: " + badge.isActive());
        System.out.println();
    }
}