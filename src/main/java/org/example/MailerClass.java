package org.example;

import javax.mail.*;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;
import java.util.Properties;

public class MailerClass {
    void sendMail(){
       Properties SystemProperties= System.getProperties();//HashTable
        System.out.println(SystemProperties);
        SystemProperties.put("mail.smtp.host",MailData.HostServer);
        SystemProperties.put("mail.smtp.port",MailData.PortNumber);
        SystemProperties.put(MailData.sslEnable,true);
        SystemProperties.put(MailData.Authorized,true);


        Authenticator mailAuthenticat=new MailAuth();
        Session MailSession=Session.getInstance(SystemProperties,mailAuthenticat);

        MimeMessage mailmsg=new MimeMessage(MailSession);

        try {
            mailmsg.setFrom(MailData.UserMail);
            mailmsg.setSubject("Text msg From Amit Singh");
            mailmsg.setText("Heloo This is test Submitted code \n @Amit Singh");
            Address recieverMail = new InternetAddress(MailData.RecieverMail);
            mailmsg.setRecipient(Message.RecipientType.TO,recieverMail);
            Transport.send(mailmsg);
        }
        catch (Exception mailException){
            System.out.println(mailException.toString());
        }
    }
}
