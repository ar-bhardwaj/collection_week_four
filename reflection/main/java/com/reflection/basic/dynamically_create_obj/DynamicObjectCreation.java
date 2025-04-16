package com.reflection.basic.dynamically_create_obj;

import java.lang.reflect.Constructor;

public class DynamicObjectCreation {
    public static void main(String[] args) {
        try {
            // Get the Class object for Student
        	
            Class<?> cls = Student.class;

            // Get the constructor with parameters (String, int)
            Constructor<?> constructor = cls.getConstructor(String.class, int.class);

            // Create an instance of Student using the constructor
            Object studentObj = constructor.newInstance("Alice", 21);

            // Call display() method using reflection
            cls.getMethod("display").invoke(studentObj);

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
