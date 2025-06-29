package com.example;

import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.*;

public class BankAccountTest {

    BankAccount account;

    @BeforeEach
    void setUp() {
        // 🔵 Arrange
        account = new BankAccount(100); // common fixture
        System.out.println("Setup complete");
    }

    @AfterEach
    void tearDown() {
        // Cleanup if needed
        System.out.println("Teardown after test");
    }

    @BeforeAll
    static void initAll() {
        System.out.println("Before ALL tests");
    }

    @AfterAll
    static void cleanupAll() {
        System.out.println("After ALL tests");
    }

    @Test
    void testDeposit() {
        // 🟡 Act
        account.deposit(50);

        // 🟢 Assert
        assertEquals(150, account.getBalance());
    }

    @Test
    void testWithdraw() {
        // 🟡 Act
        account.withdraw(30);

        // 🟢 Assert
        assertEquals(70, account.getBalance());
    }

    @Test
    void testWithdrawTooMuch() {
        // 🟡 Act + 🟢 Assert
        Exception ex = assertThrows(IllegalArgumentException.class, () -> account.withdraw(200));
        assertEquals("Insufficient funds", ex.getMessage());
    }
}
