package org.example;

public class NewEmailTemplate extends EmailTemplate {
    protected String greeting() {
        return "Welcome to our platform!";
    }

    protected String closing() {
        return "Cheers,\nThe Onboarding Team";
    }
}
