package com.reflection.basic.access_private_field;

import java.lang.reflect.Field;

public class Main {
	public static void main(String[] args) {
		try {
			   Person person = new Person(25);
			   person.displayAge();

	            // Get the Class object
	            Class<?> cls = person.getClass();

	            // Access private field 'age'
	            Field ageField = cls.getDeclaredField("age");
	            ageField.setAccessible(true); // Allow access to private fields

	            // Get the current value of 'age'
	            int currentAge = (int) ageField.get(person);
	            System.out.println("Retrieved Private Age: " + currentAge);

	            // Modify the value of 'age'
	            ageField.set(person, 30);
	            System.out.println("Updated Private Age: " + ageField.get(person));

	            // Display updated age
	            person.displayAge();

	        } catch (Exception e) {
	            e.printStackTrace();
		}
	}
}
