package com.example;

import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

import static org.mockito.Mockito.*;

public class OrderServiceTest {

    @Test
    void testEmailSentWhenOrderPlaced() {
        // Arrange (Mock the dependency)
        EmailService mockEmailService = mock(EmailService.class);

        // Inject mock into service
        OrderService orderService = new OrderService(mockEmailService);

        // Act (Call method to test)
        orderService.placeOrder("user@example.com");

        // Assert (Verify interaction)
        verify(mockEmailService).sendEmail(
            eq("user@example.com"),
            eq("Order Placed"),
            eq("Thank you for your order!")
        );

        // Optionally verify it was called exactly once
        verify(mockEmailService, times(1)).sendEmail(anyString(), anyString(), anyString());
    }
}
