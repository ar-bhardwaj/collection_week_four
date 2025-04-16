package com.reflection.basic.dynamically_create_obj;

import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;

import java.lang.reflect.Constructor;

import org.junit.Test;

import com.reflection.basic.dynamically_create_obj.Student;

public class DynamicObjectCreationTest {

    @Test
    public void testStudentObjectCreation() {
        try {
            // Load the Student class dynamically
            Class<?> cls = Student.class;

            // Get the constructor
            Constructor<?> constructor = cls.getConstructor(String.class, int.class);

            // Create an instance
            Object studentObj = constructor.newInstance("John", 22);

            // Verify if the object is an instance of Student
            assertTrue("Object should be an instance of Student", cls.isInstance(studentObj));

        } catch (Exception e) {
            fail("Exception occurred: " + e.getMessage());
        }
    }
}
