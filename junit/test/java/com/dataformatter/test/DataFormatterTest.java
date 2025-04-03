package com.dataformatter.test;

// DateFormatterTest.java
import static org.junit.jupiter.api.Assertions.*;

import com.dataformatter.DateFormatter;
import org.junit.jupiter.api.Test;

class DateFormatterTest {
    private final DateFormatter dateFormatter = new DateFormatter();

    @Test
    void testValidDateFormat() {
        assertEquals("25-03-2025", dateFormatter.formatDate("2025-03-25"));
        assertEquals("01-01-2024", dateFormatter.formatDate("2024-01-01"));
    }

    @Test
    void testInvalidDateFormat() {
        assertThrows(IllegalArgumentException.class, () -> dateFormatter.formatDate("25/03/2025"));
        assertThrows(IllegalArgumentException.class, () -> dateFormatter.formatDate("March 25, 2025"));
    }
}
