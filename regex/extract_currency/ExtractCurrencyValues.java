package regex.extract_currency;

import java.util.regex.*;
import java.util.ArrayList;

public class ExtractCurrencyValues {

    public static void main(String[] args) {
        String text = "The price is $45.99, and the discount is 10.50.";

        ArrayList<String> currencyValues = extractCurrencyValues(text);

        System.out.println(currencyValues);
    }

    public static ArrayList<String> extractCurrencyValues(String text) {
        // Regex pattern to match currency values (with or without a $ sign)
        String regex = "\\$?\\d+(\\.\\d{2})?";

        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(text);

        ArrayList<String> foundValues = new ArrayList<>();

        while (matcher.find()) {
            foundValues.add(matcher.group());
        }

        return foundValues;
    }
}