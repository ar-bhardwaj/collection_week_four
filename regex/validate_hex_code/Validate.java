package regex.validate_hex_code;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Validate {
	//method to validate color code
	public static boolean isValidHexCode(String code) {
		String regex = "^#[A-Fa-f0-9]{6}$";
		//comiling regular expression
		Pattern pattern = Pattern.compile(regex);
		//matches the compile with the given code
		Matcher matcher = pattern.matcher(regex);
		return matcher.matches();
	}
}
