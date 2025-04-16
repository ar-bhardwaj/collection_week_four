package com.reflection.intermediate.access_modify_static_field;


import java.lang.reflect.Field;

public class StaticFieldModifier {

    public static void main(String[] args) {
        try {
            // Print the original value
            Configuration.printApiKey();

            // Access the Configuration class
            Class<?> cls = Class.forName("com.reflection.intermediate.access_modify_static_field.Configuration");

            // Access the private static field "API_KEY"
            Field field = cls.getDeclaredField("API_KEY");

            // Set accessible to true to bypass the private access
            field.setAccessible(true);

            // Modify the static field's value
            field.set(null, "NEW_API_KEY_12345");

            // Print the modified value
            Configuration.printApiKey();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
