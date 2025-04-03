package regex.social_security_num;

import java.util.regex.*;

public class ValidateSSN {

    public static void main(String[] args) {
        String[] testSSNs = {
            "123-45-6789",
            "987-65-4321",
            "123456789",
            "12-345-6789",
            "000-12-3456",
            "666-45-6789"
        };

        for (String ssn : testSSNs) {
            System.out.println(ssn + " → " + (isValidSSN(ssn) ? "Valid" : "Invalid"));
        }
    }
    //method to check provided SSN is valid
    public static boolean isValidSSN(String ssn) {
        String regex = "^(?!000|666)[0-9]{3}-[0-9]{2}-[0-9]{4}$";
        return Pattern.matches(regex, ssn);
    }
}
