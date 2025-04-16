package com.reflection.intermediate.runtime;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;

import java.lang.annotation.Annotation;

import org.junit.Test;

import com.reflection.intermediate.runtime.Author;

public class AnnotationRetrieverTest {

    @Test
    public void testAuthorAnnotationExists() {
        try {
            // Load the class dynamically
            Class<?> cls = Class.forName("com.reflection.intermediate.runtime.MyClassAnnotation");

            // Check if the @Author annotation is present
            assertTrue(cls.isAnnotationPresent(Author.class));

            // Retrieve the annotation
            Annotation annotation = cls.getAnnotation(Author.class);
            Author author = (Author) annotation;

            // Check the author name
            assertEquals("ashu", author.name());
        } catch (ClassNotFoundException e) {
            fail("Class not found: " + e.getMessage());
        }
    }

    @Test
    public void testAuthorAnnotationDoesNotExist() {
        try {
            // Load a class without the annotation
            Class<?> cls = Class.forName("java.lang.String");

            // Check that the annotation is not present
            assertFalse(cls.isAnnotationPresent(Author.class));
        } catch (ClassNotFoundException e) {
            fail("Class not found: " + e.getMessage());
        }
    }

    @Test
    public void testInvalidClassName() {
        try {
            // Try loading a non-existing class
            Class.forName("com.reflection.intermediate.runtime.NonExistentClass");
            fail("Expected ClassNotFoundException");
        } catch (ClassNotFoundException e) {
            // Pass the test since exception is expected
            assertTrue(true);
        }
    }
}
