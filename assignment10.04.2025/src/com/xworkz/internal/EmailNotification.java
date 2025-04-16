package com.xworkz.internal;

public class EmailNotification extends Notification {
    protected String recipient;
    protected String subject;

    public EmailNotification(String message, String recipient, String subject) {
        super(message);
        this.recipient = recipient;
        this.subject = subject;
    }

    public void sendEmail() {
        System.out.println("Sending email to " + recipient + " with subject '" + subject + "': " + message);
    }

    @Override
    public void send() {
        sendEmail();
    }

    @Override
    public String toString() {
        return "EmailNotification [message=" + message + ", recipient=" + recipient + ", subject=" + subject + "]";
    }
}