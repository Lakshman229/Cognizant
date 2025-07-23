package com.example;

import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;

public class UserServiceTest {

    @Test
    void testGetUsernameReturnsStubbedValue() {
        // 🔵 Arrange: Create mock
        UserRepository mockRepo = mock(UserRepository.class);

        // Stub behavior
        when(mockRepo.findUsernameById(1)).thenReturn("john_doe");

        // Inject mock into service
        UserService userService = new UserService(mockRepo);

        // 🟡 Act: Call the method under test
        String username = userService.getUsername(1);

        // 🟢 Assert: Check expected result
        assertEquals("john_doe", username);

        // ✅ Verify the method was called once with argument 1
        verify(mockRepo, times(1)).findUsernameById(1);
    }
}
