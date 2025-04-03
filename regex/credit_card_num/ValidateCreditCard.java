package regex.credit_card_num;

import java.util.regex.Pattern;

public class ValidateCreditCard {

    public static void main(String[] args) {
        String[] testCards = {
            "4123456789012345",  // Valid Visa
            "5123456789012345",  // Valid MasterCard
            "6123456789012345",  // Invalid (does not start with 4 or 5)
            "41234567890123",    // Invalid (less than 16 digits)
            "51234567890123456"  // Invalid (more than 16 digits)
        };

        for (String card : testCards) {
            System.out.println(card + " → " + (Valid.isValidCreditCard(card) ? "Valid" : "Invalid"));
        }
    }

   
}
