package com.example;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class CityApp {
    public static void main(String[] args) {
        try (ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("config.xml")) {
            City city = context.getBean("cityBean", City.class);
            System.out.println(city);
        }
    }
}
