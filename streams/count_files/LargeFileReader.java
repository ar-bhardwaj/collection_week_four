package count_files;

import java.io.*;
import java.util.*;

public class LargeFileReader {
    public static void main(String[] args) {
        String filePath = "C:\\Users\\Aditi\\Desktop\\bridgelabz-workspace\\collections_java\\streams\\count_files\\frequentwords.txt"; 
        
        Map<String, Integer> wordCount = new HashMap<>();
        
        try (BufferedReader reader = new BufferedReader(new FileReader(filePath))) {
            String line;
            while ((line = reader.readLine()) != null) {
                String[] words = line.toLowerCase().split("\\W+"); // Split by non-word characters
                for (String word : words) {
                    if (!word.isEmpty()) {
                        wordCount.put(word, wordCount.getOrDefault(word, 0) + 1);
                    }
                }
            }
        } catch (IOException e) {
            System.err.println("Error reading file: " + e.getMessage());
        }
        
        // Sort by frequency
        List<Map.Entry<String, Integer>> sortedWords = new ArrayList<>(wordCount.entrySet());
        sortedWords.sort((a, b) -> b.getValue().compareTo(a.getValue()));
        
        // Display top 5 words
        System.out.println("Top 5 most frequent words:");
        for (int i = 0; i < Math.min(5, sortedWords.size()); i++) {
            System.out.println(sortedWords.get(i).getKey() + ": " + sortedWords.get(i).getValue());
        }
    }
}


