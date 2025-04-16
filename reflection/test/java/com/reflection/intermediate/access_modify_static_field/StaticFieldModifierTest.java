package com.reflection.intermediate.access_modify_static_field;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.fail;

import java.lang.reflect.Field;

import org.junit.Test;

public class StaticFieldModifierTest {

    @Test
    public void testModifyApiKey() {
        try {
            // Reset the API_KEY to the original value before testing
            resetApiKey();

            // Access the Configuration class
            Class<?> cls = Class.forName("com.reflection.intermediate.access_modify_static_field.Configuration");

            // Access the private static field "API_KEY"
            Field field = cls.getDeclaredField("API_KEY");
            field.setAccessible(true);

            // Modify the static field's value
            field.set(null, "TEST_API_KEY");

            // Verify the modified value
            String modifiedValue = (String) field.get(null);
            assertEquals("TEST_API_KEY", modifiedValue);

        } catch (Exception e) {
            fail("Exception occurred: " + e.getMessage());
        }
    }

    @Test
    public void testResetApiKey() {
        try {
            // Reset the API_KEY to the original value
            resetApiKey();

            // Access the Configuration class
            Class<?> cls = Class.forName("com.reflection.intermediate.access_modify_static_field.Configuration");

            // Access the private static field "API_KEY"
            Field field = cls.getDeclaredField("API_KEY");
            field.setAccessible(true);

            // Check the reset value
            String originalValue = (String) field.get(null);
            assertEquals("DEFAULT_KEY", originalValue);

        } catch (Exception e) {
            fail("Exception occurred: " + e.getMessage());
        }
    }

    // Utility method to reset the API_KEY field
    private void resetApiKey() {
        try {
            Class<?> cls = Class.forName("com.reflection.intermediate.access_modify_static_field.Configuration");
            Field field = cls.getDeclaredField("API_KEY");
            field.setAccessible(true);
            field.set(null, "DEFAULT_KEY");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
