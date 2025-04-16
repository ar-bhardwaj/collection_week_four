package com.reflection.intermediate.dynamic_method_invocation;
import java.lang.reflect.Method;
import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
            Scanner scanner = new Scanner(System.in);
            
            // Get user input for method name
            System.out.print("Enter method name (add, subtract, multiply): ");
            String methodName = scanner.nextLine();

            // Get user input for numbers
            System.out.print("Enter first number: ");
            int num1 = scanner.nextInt();
            
            System.out.print("Enter second number: ");
            int num2 = scanner.nextInt();

            // Create an instance of MathOperations
            MathOperation mathOps = new MathOperation();
            
            // Get the method dynamically based on the user input
            Method method = MathOperation.class.getMethod(methodName, int.class, int.class);
            
            // Invoke the method dynamically
            int result = (int) method.invoke(mathOps, num1, num2);
            
            // Print the result
            System.out.println("Result: " + result);
            
            scanner.close();
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
	}

}
