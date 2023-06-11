package org.example;

import javax.mail.Authenticator;
import javax.mail.PasswordAuthentication;

public class MailAuth extends Authenticator {
    protected PasswordAuthentication getPasswordAuthentication(){
        return new PasswordAuthentication(MailData.UserMail,MailData.Pass);
    }
}
