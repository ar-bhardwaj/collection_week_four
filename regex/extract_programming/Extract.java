package regex.extract_programming;

import java.util.ArrayList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Extract {
	 public static ArrayList<String> extractLanguages(String text) {
	        // Define regex pattern to match programming languages
	        String regex = "\\b(JavaScript|Java|Python|Go|C\\+\\+|C#|Ruby|Swift|Kotlin|PHP|Rust|TypeScript)\\b";

	        Pattern pattern = Pattern.compile(regex);
	        Matcher matcher = pattern.matcher(text);

	        ArrayList<String> foundLanguages = new ArrayList<>();

	        while (matcher.find()) {
	            foundLanguages.add(matcher.group());
	        }

	        return foundLanguages;
	    }
}
