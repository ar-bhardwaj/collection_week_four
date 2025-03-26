package exception_handling.unchecked_excep;

import java.util.Scanner;
import java.util.InputMismatchException;

public class DivisionExample {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        try {
            // Taking user input
            System.out.print("Enter numerator: ");
            int num1 = scanner.nextInt();
            System.out.print("Enter denominator: ");
            int num2 = scanner.nextInt();

            // Performing division
            int result = num1 / num2;
            System.out.println("Result: " + result);
        } catch (ArithmeticException e) { // Handles division by zero
            System.out.println("Cannot divide by zero!");
        } catch (InputMismatchException e) { // Handles non-numeric input
            System.out.println("Invalid input! Please enter numbers only.");
        } finally {
            scanner.close(); // Ensuring resource closure
        }
    }
}
