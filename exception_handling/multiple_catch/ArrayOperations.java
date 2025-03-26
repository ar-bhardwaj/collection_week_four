package exception_handling.multiple_catch;

import java.util.*;

public class ArrayOperations {
    public static void main(String[] args) {
        Integer[] arr = { 4, 14, 7, 2, 9, 6 };
        Scanner sc = new Scanner(System.in);

        try {
            System.out.print("Enter index to access: ");
            int index = sc.nextInt();
            System.out.println("Value at index " + index + ": " + arr[index]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Invalid index!");
        } catch (NullPointerException e) {
            System.out.println("Array is not initialized!");
        } finally {
            sc.close();
            {

            }

        }

    }
}
