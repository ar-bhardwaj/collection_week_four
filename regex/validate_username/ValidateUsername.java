package regex.validate_username;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ValidateUsername {

    public static void main(String[] args) {
        String text = "Ashu_123";
        String regex = "^[A-Za-z][A-Za-z0-9_]{4,14}$";

        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(text);

        if (matcher.matches()) {
            System.out.println("Valid");
        } else {
            System.out.println("Not valid");
        }
    }
}
