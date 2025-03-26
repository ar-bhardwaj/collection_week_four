package exception_handling.unchecked_exception;

import java.util.*;

public class DivisionEx {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try {
            // Taking user input
            System.out.print("Enter numerator: ");
            int num1 = sc.nextInt();
            System.out.print("Enter denominator: ");
            int num2 = sc.nextInt();

            // Performing division
            int result = num1 / num2;
            System.out.println("Result: " + result);
        } catch (ArithmeticException e) { // Handles division by zero
            System.out.println("Cannot be divided by zero");
        } catch (InputMismatchException e) { // Handles non-numeric input
            System.out.println("Invalid Input, please enter Numbers only");

        } finally {
            sc.close(); // Ensuring resource closure
        }

    }

}
