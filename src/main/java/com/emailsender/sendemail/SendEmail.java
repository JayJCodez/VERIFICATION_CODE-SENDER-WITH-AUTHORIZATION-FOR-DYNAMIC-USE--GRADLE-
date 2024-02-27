package com.emailsender.sendemail;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.stereotype.Service;

@Service
public class SendEmail {
    
    @Autowired
    public JavaMailSender sender;

    public void send(String toEmailAdd, String subject, String message){
        SimpleMailMessage msg = new SimpleMailMessage();
        msg.setFrom("jesseokuji123@gmail.com");
        msg.setTo(toEmailAdd);
        msg.setSubject(subject);
        msg.setText(message);
        sender.send(msg);
    
    }

   
    
    
}
