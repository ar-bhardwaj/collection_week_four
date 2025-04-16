package com.reflection.advanced.method_execution_time;

import java.lang.reflect.Method;

public class MethodTimingUtil {

    public static void measureMethodExecutionTime(Object obj) {
        Class<?> cls = obj.getClass();
        Method[] methods = cls.getDeclaredMethods();

        for (Method method : methods) {
            if (method.getParameterCount() == 0) {  // Only methods with no parameters
                try {
                    method.setAccessible(true);  // Allow access to private methods

                    long startTime = System.nanoTime();  // Start time

                    method.invoke(obj);  // Execute the method

                    long endTime = System.nanoTime();  // End time
                    long duration = endTime - startTime;

                    System.out.println("Method: " + method.getName() + " executed in " + duration + " nanoseconds.");
                } catch (Exception e) {
                    System.err.println("Error executing method " + method.getName() + ": " + e.getMessage());
                }
            }
        }
    }
}
