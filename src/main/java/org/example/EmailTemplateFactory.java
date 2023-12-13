package org.example;

public class EmailTemplateFactory {
    public static EmailTemplate createEmailTemplate(String customerType) {
        switch (customerType.toLowerCase()) {
            case "business":
                return new BusinessEmailTemplate();
            case "vip":
                return new VIPEmailTemplate();
            case "returning":
                return new ReturningEmailTemplate();
            case "new":
                return new NewEmailTemplate();
            case "frequent":
                return new FrequentEmailTemplate();
            default:
                throw new IllegalArgumentException("Invalid customer type");
        }
    }
}
