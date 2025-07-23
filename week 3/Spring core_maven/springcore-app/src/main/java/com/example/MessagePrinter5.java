package com.example;

public class MessagePrinter5 {
    private MessageService5 service;

    // Setter method for dependency injection
    public void setService(MessageService5 service) {
        this.service = service;
    }

    public void printMessage() {
        System.out.println(service.getMessage());
    }
}
