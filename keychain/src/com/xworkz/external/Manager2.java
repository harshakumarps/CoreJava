package com.xworkz.external;

import com.xworkz.internal.Badge;

public class Manager2 {
    public void manage() {
        Badge badge = new Badge();
        System.out.println("ID: " + badge.getId());
        System.out.println("Name: " + badge.getName());
        System.out.println("Role: " + badge.getRole());
        System.out.println("Security Level: " + badge.getSecurityLevel());
        System.out.println("Is Active: " + badge.isActive());
        System.out.println();
    }
}