package com.reflection.basic.invoke_private_method;

import java.lang.reflect.Method;

public class InvokePrivateMethod {
    public static void main(String[] args) {
        try {
            // Create an instance of Calculator
            Calculator calculator = new Calculator();

            // Get the Class object
            Class<?> cls = calculator.getClass();

            // Access the private method "multiply"
            Method multiplyMethod = cls.getDeclaredMethod("multiply", int.class, int.class);
            multiplyMethod.setAccessible(true); // Allow access to private method

            // Invoke the method with arguments (5, 4)
            int result = (int) multiplyMethod.invoke(calculator, 5, 4);

            // Display the result
            System.out.println("Result of multiply(5, 4): " + result);

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

