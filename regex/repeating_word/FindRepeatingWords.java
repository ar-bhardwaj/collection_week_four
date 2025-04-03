package regex.repeating_word;

import java.util.regex.*;
import java.util.HashSet;

public class FindRepeatingWords {

    public static void main(String[] args) {
        String text = "This is is a repeated repeated word test.";

        HashSet<String> repeatingWords = findRepeatingWords(text);

        System.out.println(repeatingWords);
    }

    public static HashSet<String> findRepeatingWords(String text) {
        // Regex pattern to find repeated words
        String regex = "\\b(\\w+)\\b(?:\\s+\\1\\b)";

        Pattern pattern = Pattern.compile(regex, Pattern.CASE_INSENSITIVE);
        Matcher matcher = pattern.matcher(text);

        HashSet<String> repeatedWords = new HashSet<>();

        while (matcher.find()) {
            repeatedWords.add(matcher.group(1)); // Capture only the repeated word
        }

        return repeatedWords;
    }
}

