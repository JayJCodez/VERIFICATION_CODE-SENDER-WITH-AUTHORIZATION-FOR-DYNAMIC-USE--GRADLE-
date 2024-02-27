package com.emailsender.sendemail;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.event.ApplicationReadyEvent;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.event.EventListener;

@SpringBootApplication
public class SendemailApplication {

	@Autowired
	private SendEmail senderservice;



	public static void main(String[] args) {

		

		new Frontend().ActionClass();
		
		SpringApplication.run(SendemailApplication.class, args);

	

	}

	@EventListener
	public void start(ApplicationReadyEvent event){

		senderservice.send(Frontend.getEmailadd(),"VERIFICATION",Frontend.getAuthotp());


		new Frontend().InnerFrontend();
	}
	
}
