package org.example;

public abstract class EmailTemplate {
    public final String generateEmail(String message) {
        return greeting() + "\n" + message + "\n" + closing();
    }

    protected abstract String greeting();
    protected abstract String closing();
}
