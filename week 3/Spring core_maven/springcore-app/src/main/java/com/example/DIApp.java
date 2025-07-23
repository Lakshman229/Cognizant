package com.example;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class DIApp {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("di-beans.xml");

        Greeter greeter = context.getBean("greeter", Greeter.class);
        greeter.sayGreeting();
    }
}
