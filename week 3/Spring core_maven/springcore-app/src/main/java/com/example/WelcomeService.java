package com.example;

public class WelcomeService implements GreetService {
    @Override
    public String greet() {
        return "Hey Lakshman! This is Dependency Injection in action!";
    }
}
