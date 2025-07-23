package com.example;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class LoggingExample {

    // Create logger for this class
    private static final Logger logger = LoggerFactory.getLogger(LoggingExample.class);

    public static void main(String[] args) {

        logger.info("Application started.");

        int value = 10;
        try {
            logger.warn("Potential risky operation with value: {}", value);
            int result = value / 0; // This will throw an exception
        } catch (ArithmeticException e) {
            logger.error("An error occurred: Division by zero!", e);
        }

        logger.info("Application ended.");
    }
}
