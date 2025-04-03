package com.temperatureconvertor.test;
import static org.junit.jupiter.api.Assertions.*;

import com.tempreatureconvertor.TemperatureConverter;
import org.junit.jupiter.api.Test;

public class TemperatureCovertorTest {
    private final TemperatureConverter converter = new TemperatureConverter();

    @Test
    void testCelsiusToFahrenheit() {
        assertEquals(32.0, converter.celsiusToFahrenheit(0), 0.01);
        assertEquals(98.6, converter.celsiusToFahrenheit(37), 0.01);
    }

    @Test
    void testFahrenheitToCelsius() {
        assertEquals(0.0, converter.fahrenheitToCelsius(32), 0.01);
        assertEquals(37.0, converter.fahrenheitToCelsius(98.6), 0.01);
    }
}
