package filter_stream;

import java.io.*;

public class ConvertToLowercase {
    public static void main(String[] args) {
        String sourceFile = "C:\\Users\\Aditi\\Desktop\\bridgelabz-workspace\\collections_java\\streams\\filter_stream\\source.txt";
        String destinationFile = "destination.txt";

        // Read from source file and write to destination file
        try (BufferedReader reader = new BufferedReader(new FileReader(sourceFile));
             BufferedWriter writer = new BufferedWriter(new FileWriter(destinationFile))) {
            
            String line;
            while ((line = reader.readLine()) != null) {
                writer.write(line.toLowerCase()); // Convert to lowercase
                writer.newLine(); // Preserve line breaks
            }
            
            System.out.println("File converted successfully.");
        } catch (IOException e) {
            System.out.println("Error processing file: " + e.getMessage());
        }
    }
}
