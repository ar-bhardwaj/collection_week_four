package regex.credit_card_num;

import java.util.regex.Pattern;

public class Valid {
	 public static boolean isValidCreditCard(String cardNumber) {
	        String visaRegex = "^4[0-9]{15}$";        // Visa: Starts with 4, 16 digits
	        String masterCardRegex = "^5[0-9]{15}$";  // MasterCard: Starts with 5, 16 digits

	        return Pattern.matches(visaRegex, cardNumber) || Pattern.matches(masterCardRegex, cardNumber);
	    }
}
