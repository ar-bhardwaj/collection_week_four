package com.reflection.basic.getclass_info;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.Scanner;

public class GetClassInfo {
    public static void main(String[] args) throws ClassNotFoundException {
    	 Scanner scanner = new Scanner(System.in);
         System.out.print("Enter the class name: ");
         String className = scanner.nextLine();
         scanner.close();
 
         try {
             // Load the class dynamically
        	 Person person = new Person("Ashu",21);
             Class<?> cls = person.getClass();

             // Display class name
             System.out.println("\nClass: " + cls.getName());

             // Display constructors
             System.out.println("\nConstructors:");
             Constructor<?>[] constructors = cls.getDeclaredConstructors();
             for (Constructor<?> constructor : constructors) {
                 System.out.println("  " + constructor);
             }

             // Display methods
             System.out.println("\nMethods:");
             Method[] methods = cls.getDeclaredMethods();
             for (Method method : methods) {
                 System.out.println("  " + method);
             }

             // Display fields
             System.out.println("\nFields:");
             Field[] fields = cls.getDeclaredFields();
             for (Field field : fields) {
                 System.out.println("  " + field);
             }

         } catch (Exception e) {
             System.out.println("Error: " + e.getMessage());
         }
    }
    
}
