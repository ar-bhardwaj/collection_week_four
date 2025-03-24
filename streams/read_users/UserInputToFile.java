package read_users;

import java.io.*;

public class UserInputToFile {
    public static void main(String[] args) {
        // Read user input from console
        try (BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
             FileWriter writer = new FileWriter("C:\\Users\\Aditi\\Desktop\\bridgelabz-workspace\\collections_java\\streams\\read_users\\user_data.txt")) {
            
            System.out.print("Enter your name: ");
            String name = reader.readLine();
            
            System.out.print("Enter your age: ");
            String age = reader.readLine();
            
            System.out.print("Enter your favorite programming language: ");
            String language = reader.readLine();
            
            // Write data to file
            writer.write("Name: " + name + "\n");
            writer.write("Age: " + age + "\n");
            writer.write("Favorite Programming Language: " + language + "\n");
            
            System.out.println("User data saved successfully to user_data.txt");
        } catch (IOException e) {
            System.out.println("An error occurred: " + e.getMessage());
        }
    }
}
