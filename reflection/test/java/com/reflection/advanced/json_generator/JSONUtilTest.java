package com.reflection.advanced.json_generator;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

import com.reflection.advanced.json_generator.JSONUtil;
import com.reflection.advanced.json_generator.Person;

public class JSONUtilTest {

    @Test
    public void testToJson_withPersonObject() {
        Person person = new Person("John", 30, true);
        String expectedJson = "{\"name\":\"John\", \"age\":30, \"isActive\":true}";
        String actualJson = JSONUtil.toJson(person);

        assertEquals("JSON string should match the expected format", expectedJson, actualJson);
    }

    @Test
    public void testToJson_withEmptyObject() {
        Person person = new Person("", 0, false);
        String expectedJson = "{\"name\":\"\", \"age\":0, \"isActive\":false}";
        String actualJson = JSONUtil.toJson(person);

        assertEquals("JSON string should handle empty fields correctly", expectedJson, actualJson);
    }

    @Test
    public void testToJson_withNullObject() {
        String actualJson = JSONUtil.toJson(null);
        assertEquals("JSON string should return 'null' for a null object", "null", actualJson);
    }

    @Test
    public void testToJson_withCustomObject() {
        CustomObject obj = new CustomObject("Sample", 42);
        String expectedJson = "{\"title\":\"Sample\", \"value\":42}";
        String actualJson = JSONUtil.toJson(obj);

        assertEquals("JSON string should correctly serialize custom objects", expectedJson, actualJson);
    }

    @Test
    public void testToJson_withSpecialCharacters() {
        Person person = new Person("O'Neil", 25, true);
        String expectedJson = "{\"name\":\"O'Neil\", \"age\":25, \"isActive\":true}";
        String actualJson = JSONUtil.toJson(person);

        assertEquals("JSON string should correctly handle special characters", expectedJson, actualJson);
    }
}

// Supporting CustomObject class for testing
class CustomObject {
    private String title;
    private int value;

    public CustomObject(String title, int value) {
        this.title = title;
        this.value = value;
    }
}

