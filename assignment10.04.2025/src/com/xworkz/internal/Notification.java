package com.xworkz.internal;

public class Notification {
    protected String message;

    public Notification(String message) {
        this.message = message;
    }

    public void send() {
        System.out.println("Sending notification: " + message + ".");
    }

    @Override
    public String toString() {
        return "Notification [message=" + message + "]";
    }
}