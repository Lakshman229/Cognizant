package com.example;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class BookApp7 {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("beans-book.xml");

        Book7 book = context.getBean("bookBean7", Book7.class);
        book.displayDetails();
    }
}
