package com.example;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class IoCApp5 {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("beans-printer.xml");

        MessagePrinter5 printer = context.getBean("messagePrinter5", MessagePrinter5.class);
        printer.printMessage();
    }
}
