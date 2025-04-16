package com.reflection.advanced.di;

import java.lang.reflect.Field;

public class DIContainer {

    public static void injectDependencies(Object obj) {
        Class<?> cls = obj.getClass();

        // Iterate over all declared fields
        for (Field field : cls.getDeclaredFields()) {
            // Check if the field has @Inject annotation
            if (field.isAnnotationPresent(Inject.class)) {
                try {
                    // Get the field type (dependency class)
                    Class<?> fieldType = field.getType();

                    // Create an instance of the dependency class
                    Object dependency = fieldType.getDeclaredConstructor().newInstance();

                    // Make the private field accessible
                    field.setAccessible(true);

                    // Inject the created instance
                    field.set(obj, dependency);

                    System.out.println("Injected dependency: " + fieldType.getSimpleName());
                } catch (Exception e) {
                    throw new RuntimeException("Failed to inject dependency: " + e.getMessage());
                }
            }
        }
    }
}

