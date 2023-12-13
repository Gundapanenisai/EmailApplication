package org.example;

public class BusinessEmailTemplate extends EmailTemplate {
    protected String greeting() {
        return "Dear Valued Business Partner,";
    }

    protected String closing() {
        return "Best regards,\nThe Business Team";
    }
}
