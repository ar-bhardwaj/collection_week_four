package com.reflection.basic.access_private_field;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.fail;

import java.lang.reflect.Field;

import org.junit.Test;

import com.reflection.basic.access_private_field.Person;

public class TestPrivateAccessField {
	@Test
	public void TestModifyField() {
		try {
			Person person = new Person(25);
			Class<?>cls = person.getClass();
			Field field = cls.getDeclaredField("age");
			field.setAccessible(true);
			int age = (int)field.get(person);;
			assertEquals(25,age);
		}
		catch(Exception e) {
			fail("Excetpion "+e.getMessage());
		}
	}
	
	  @Test
	   public void testModifyPrivateField() {
	        try {
	            Person person = new Person(25);
	            Class<?> cls = person.getClass();

	            // Access private field 'age'
	            Field ageField = cls.getDeclaredField("age");
	            ageField.setAccessible(true);

	            // Modify the value of 'age'
	            ageField.set(person, 30);

	            // Get the updated value
	            int updatedAge = (int) ageField.get(person);

	            // Verify age update
	            assertEquals(30, updatedAge);

	        } catch (Exception e) {
	            fail("Exception occurred: " + e.getMessage());
	        }
	  }
}
