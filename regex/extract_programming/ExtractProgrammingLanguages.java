package regex.extract_programming;

import java.util.ArrayList;

public class ExtractProgrammingLanguages {

    public static void main(String[] args) {
        String text = "I love Java, Python, and JavaScript, but I haven't tried Go yet.";

        ArrayList<String> languages = Extract.extractLanguages(text);

        System.out.println(languages);
    }
}
