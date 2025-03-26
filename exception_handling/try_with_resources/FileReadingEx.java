package exception_handling.try_with_resources;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class FileReadingEx {
      public static void main(String[] args) {
        try (BufferedReader reader = new BufferedReader(new FileReader("info.txt"))) {
            System.out.println(reader.readLine()); // Reading the first line
        } catch (IOException e) {
            System.out.println("Error reading file");
        }
    }
    
}
