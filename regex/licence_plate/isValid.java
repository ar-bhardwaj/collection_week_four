package regex.licence_plate;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class isValid{
	//method to check if licence plate number is valid or no
	public static boolean isValidPlateNumber(String number) {
		String regex = "^[A-Z]{2}\\d{4}";
		//decode to code into particular character
		Pattern pattern = Pattern.compile(regex);
		//used to match the exact char
		Matcher matcher = pattern.matcher(number);
		return matcher.matches();
	}
}
