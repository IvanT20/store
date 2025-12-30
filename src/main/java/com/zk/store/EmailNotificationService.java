package com.zk.store;

public class EmailNotificationService implements NotificationService
{
    @Override
    public void send(String message, String recipientEmail)
    {
        System.out.println("Sending email to: " + recipientEmail);
        System.out.println("Message: " + message);
    }
}
