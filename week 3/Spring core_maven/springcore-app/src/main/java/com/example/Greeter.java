package com.example;

public class Greeter {
    private GreetService greetService;

    // Setter injection
    public void setGreetService(GreetService greetService) {
        this.greetService = greetService;
    }

    public void sayGreeting() {
        System.out.println("Greeting: " + greetService.greet());
    }
}
