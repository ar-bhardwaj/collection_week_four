package com.reflection.basic.invoke_private_method;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.fail;

import java.lang.reflect.Method;

import org.junit.Test;

import com.reflection.basic.invoke_private_method.Calculator;

public class InvokePrivateMethodTest {

    @Test
    public void testMultiplyMethod() {
        try {
            // Create an instance of Calculator
            Calculator calculator = new Calculator();
            Class<?> cls = calculator.getClass();

            // Get the private method "multiply" with two int parameters
            Method multiplyMethod = cls.getDeclaredMethod("multiply", int.class, int.class);
            multiplyMethod.setAccessible(true);

            // Invoke multiply(5, 4) and check if result is 20
            int result = (int) multiplyMethod.invoke(calculator, 5, 4);

            assertEquals("Multiplication result should be 20", 20, result);

        } catch (Exception e) {
            fail("Exception occurred: " + e.getMessage());
        }
    }
}
