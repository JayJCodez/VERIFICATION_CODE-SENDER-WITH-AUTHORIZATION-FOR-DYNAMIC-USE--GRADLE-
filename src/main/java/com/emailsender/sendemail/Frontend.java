package com.emailsender.sendemail;

import java.util.Random;
import java.util.Scanner;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.task.TaskExecutionProperties.Simple;
import org.springframework.boot.context.event.ApplicationReadyEvent;
import org.springframework.context.event.EventListener;
import org.springframework.mail.MailSender;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;


// @SpringBootApplication
public class Frontend {

    @Autowired
	private SendEmail senderservice;

    private JavaMailSender eMailSender;

    private static String Email;

    private static String emailadd;

    private static String Authotp;



    public static String getEmailadd() {
        return emailadd;
    }


    public static void setEmailadd(String emailadd) {
        Frontend.emailadd = emailadd;
    }


    public static String getAuthotp() {
        return Authotp;
    }


    public static void setAuthotp(String authotp) {
        Authotp = authotp;
    }
    

    public void ActionClass(){
  
        // emailadd = "jesseokuji123@gmail.com";

        int otp;

        

        Random random = new Random();

        int min = 1000000;
        int max = 9999999;

        otp = random.nextInt(max-min)+min;

        Authotp = Integer.toString(otp);

        Frontend.setAuthotp(Authotp);

        System.out.println("Welcome to my verification code tester!!\n");

        System.out.println("What's your email address?");

        Scanner scanner = new Scanner(System.in);

        emailadd = scanner.nextLine();

        Frontend.setEmailadd(emailadd);

       

        // senderservice = new SendEmail();
        
        // senderservice.send(emailadd, "VERIFICATION", Authotp);
       
        System.out.println("Perfect!!! Let's get that code sent!");

        System.out.println("Please wait while we send this code!!");


      

      

        

        // int i = 0;


        // while (i > 6) {
            
        //
        // }

        

    }

   

    public void InnerFrontend() {
    
        // System.out.println(Authotp);

        String verificationcode;

        System.out.println("The verification code has been successfuly sent! Please enter you 6 didgit verification code");

        Scanner scanner2 = new Scanner(System.in);

        verificationcode = scanner2.nextLine();

        // System.out.println(verificationcode);

        if (verificationcode.equals(verificationcode)) {
                    System.out.println("VERIFICATION SUCCESSFUL");
                    
                }else{
                    System.out.println("VERIFICATION UNSUCCESSFUL TRY AGAIN!");
        
                }   
    }
	// public static void main(String[] args) {

        
	// 	SpringApplication.run(SendemailApplication.class, args);
	// }

	
    // @EventListener(ApplicationReadyEvent.class)
	// public void sendemail(){

	// 	senderservice.send("jesseokuji123@gmail.com", "Email Verification", Authotp);

	// }

    // @EventListener(ApplicationReadyEvent.class)


    
}
