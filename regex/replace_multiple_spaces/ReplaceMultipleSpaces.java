package regex.replace_multiple_spaces;

public class ReplaceMultipleSpaces {

    public static void main(String[] args) {
        // Example text with multiple spaces
        String text = "This  is   an  example   with    multiple     spaces.";

        // Replace multiple spaces with a single space using regex
        String modifiedText = text.replaceAll("\\s+", " ");

        // Print the result
        System.out.println("Modified Text: " + modifiedText);
    }
}
