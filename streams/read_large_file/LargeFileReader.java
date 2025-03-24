package read_large_file;

import java.io.*;

public class LargeFileReader {
    public static void main(String[] args) {
        String filePath = "C:\\Users\\Aditi\\Desktop\\bridgelabz-workspace\\collections_java\\streams\\read_large_file\\largefile.txt";
        
        try (BufferedReader reader = new BufferedReader(new FileReader(filePath))) {
            String line;
            while ((line = reader.readLine()) != null) {
                if (line.toLowerCase().contains("error")) {
                    System.out.println(line);
                }
            }
        } catch (IOException e) {
            System.err.println("Error reading file: " + e.getMessage());
        }
    }
}

