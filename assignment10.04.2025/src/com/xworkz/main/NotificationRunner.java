package com.xworkz.main;

import com.xworkz.internal.EmailNotification;
import com.xworkz.internal.Notification;

public class NotificationRunner {
    public static void main(String[] args) {
        Notification genericNotification = new Notification("Generic Alert!");
        genericNotification.send();
        System.out.println(genericNotification);

        EmailNotification welcomeEmail = new EmailNotification("Welcome to our platform!", "user@example.com", "Welcome");
        welcomeEmail.send();
        System.out.println(welcomeEmail);

        Notification upcastedEmail = new EmailNotification("Meeting reminder", "team@example.com", "Meeting");
        upcastedEmail.send();
        System.out.println(upcastedEmail);
    }
}