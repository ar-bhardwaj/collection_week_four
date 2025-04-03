package regex.extract_link;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ExtractLinks {

    public static void main(String[] args) {
        // Example text containing URLs
        String text = "Visit https://www.google.com and http://example.org for more info. Also check https://sub.domain.net/page.";

        // Regular expression for extracting URLs
        String regex = "(https?://[a-zA-Z0-9.-]+\\.[a-zA-Z]{2,6}(/[a-zA-Z0-9@:%_+.~#?&/=]*)?)";

        // Compile the pattern
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(text);

        // Print all matched URLs
        System.out.println("Extracted Links:");
        while (matcher.find()) {
            System.out.println(matcher.group());
        }
    }
}

