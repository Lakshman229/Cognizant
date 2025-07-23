package com.example;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class GreetingApp {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("beans-greeting.xml");
        GreetingService service = context.getBean("greetingService", GreetingService.class);
        service.greet();
    }
}
