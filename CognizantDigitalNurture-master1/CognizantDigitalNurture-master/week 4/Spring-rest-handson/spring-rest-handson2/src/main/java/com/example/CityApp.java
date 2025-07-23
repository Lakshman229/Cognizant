<<<<<<< HEAD
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
=======
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
>>>>>>> fafb6b58dcac195564aab91622ba0d61ad852a4a
