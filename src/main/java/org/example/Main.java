package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Select a customer segment: business, vip, returning, new, frequent");
        String customerType = sc.nextLine();

        System.out.println("Type your message:");
        String message = sc.nextLine();

        EmailTemplate emailTemplate = EmailTemplateFactory.createEmailTemplate(customerType);
        String email = emailTemplate.generateEmail(message);

        System.out.println("Generated Email:\n" + email);

        // This is where you'd normally integrate an email sending service to send out the email.
    }
}
