package com.userregister.test;

// UserRegistrationTest.java
import static org.junit.jupiter.api.Assertions.*;

import com.useregister.UserRegistration;
import org.junit.jupiter.api.Test;

class UserRegistrationTest {
    private final UserRegistration registration = new UserRegistration();

    @Test
    void testValidUserRegistration() {
        assertDoesNotThrow(() -> registration.registerUser("user123", "user@example.com", "StrongPass1"));
    }

    @Test
    void testEmptyUsername() {
        assertThrows(IllegalArgumentException.class, () -> registration.registerUser("", "user@example.com", "StrongPass1"));
    }

    @Test
    void testInvalidEmailFormat() {
        assertThrows(IllegalArgumentException.class, () -> registration.registerUser("user123", "invalid-email", "StrongPass1"));
    }

    @Test
    void testShortPassword() {
        assertThrows(IllegalArgumentException.class, () -> registration.registerUser("user123", "user@example.com", "short"));
    }
}
