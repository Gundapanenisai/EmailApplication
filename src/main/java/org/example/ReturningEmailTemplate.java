package org.example;

public class ReturningEmailTemplate extends EmailTemplate {
    protected String greeting() {
        return "Welcome back!";
    }

    protected String closing() {
        return "Best regards,\nThe Customer Service Team";
    }
}
