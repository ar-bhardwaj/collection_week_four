package exception_handling.custom_exception;

import java.util.Scanner;

class InvalidAgeException extends Exception {
    public InvalidAgeException(String message) {
        super(message);
    }
}

public class AgeValidition {
    static void validAge(int age) throws InvalidAgeException{
        if(age<18){
            throw new InvalidAgeException("UNDER AGE- should be 18 above");
        }
        System.out.println("Access granted!");

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try {
            System.out.print("Enter your age: ");
            int age = sc.nextInt();
            validAge(age);
        } catch (InvalidAgeException e) { // Handling custom exception
            System.out.println(e.getMessage());
        } finally {
            sc.close();
        }
    }
}