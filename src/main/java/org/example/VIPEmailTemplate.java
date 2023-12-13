package org.example;

public class VIPEmailTemplate extends EmailTemplate {
    protected String greeting() {
        return "Hello Esteemed VIP,";
    }

    protected String closing() {
        return "Warm wishes,\nThe VIP Relations Team";
    }
}
