package regex.validate_ip;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Valid {
	public static boolean isValidIP(String ip) {
        String regex = "^(25[0-5]|2[0-4][0-9]|1?[0-9][0-9]?)\\."
                     + "(25[0-5]|2[0-4][0-9]|1?[0-9][0-9]?)\\."
                     + "(25[0-5]|2[0-4][0-9]|1?[0-9][0-9]?)\\."
                     + "(25[0-5]|2[0-4][0-9]|1?[0-9][0-9]?)$";

        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(ip);
        return matcher.matches();
    }
}
