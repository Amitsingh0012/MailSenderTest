package org.example;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        MailerClass MailSend=new MailerClass();
        MailSend.sendMail();
    }
}