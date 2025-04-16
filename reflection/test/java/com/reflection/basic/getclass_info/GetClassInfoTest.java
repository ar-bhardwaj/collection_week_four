package com.reflection.basic.getclass_info;

import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

import org.junit.Test;

import com.reflection.basic.getclass_info.Person;

public class GetClassInfoTest {
    
    @Test
    public void testClassExists() {
        // No need for try-catch since Person.class is directly used
        Class<?> cls = Person.class;
        assertNotNull("Class 'Person' should not be null", cls);
    }

    @Test
    public void testMethodsExist() {
        Class<?> cls = Person.class;  // No need for Class.forName
        Method[] methods = cls.getDeclaredMethods();
        assertTrue("ArrayList should have declared methods", methods.length > 0);
    }

    @Test
    public void testFieldsExist() {
        Class<?> cls = Person.class; // No need for Class.forName
        Field[] fields = cls.getDeclaredFields();
        assertTrue("ArrayList should have declared fields", fields.length > 0);
    }

    @Test
    public void testConstructorsExist() {
        Class<?> cls = Person.class; // No need for Class.forName
        Constructor<?>[] constructors = cls.getDeclaredConstructors();
        assertTrue("ArrayList should have declared constructors", constructors.length > 0);
    }
}
