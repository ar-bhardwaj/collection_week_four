package regex.censor;

public class CensorBadWords {

    public static void main(String[] args) {
        // Example sentence with bad words
        String text = "This is a damn bad example with some stupid words.";

        // List of bad words (add more if needed)
        String[] badWords = {"damn", "stupid"};

        // Replace bad words with "****"
        for (String badWord : badWords) {
            text = text.replaceAll("(?i)\\b" + badWord + "\\b", "****");
        }

        // Print the censored sentence
        System.out.println("Censored Text: " + text);
    }
}