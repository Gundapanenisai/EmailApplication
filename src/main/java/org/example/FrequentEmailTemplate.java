package org.example;

public class FrequentEmailTemplate extends EmailTemplate {
    protected String greeting() {
        return "Hello Frequent Shopper,";
    }

    protected String closing() {
        return "Best wishes,\nThe Loyalty Program Team";
    }
}
