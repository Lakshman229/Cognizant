package com.example;

import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.*;

public class DatabaseConnectorTest {

    DatabaseConnector db;

    @BeforeEach
    void setUp() {
        db = new DatabaseConnector();
        db.connect();
    }

    @AfterEach
    void tearDown() {
        db.disconnect();
        System.out.println("Teardown: Disconnected after test.");
    }

    @AfterAll
    static void cleanUpAll() {
        System.out.println("After all tests: Final cleanup done.");
    }

    @Test
    void testConnectionIsActive() {
        assertTrue(db.isConnected());
    }

    @Test
    void testConnectionStillActive() {
        assertTrue(db.isConnected());
    }
}
