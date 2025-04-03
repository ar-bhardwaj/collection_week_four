package regex.validate_ip;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ValidateIPAddress {

    public static void main(String[] args) {
        String[] testIPs = {
            "192.168.1.1",
            "255.255.255.255",
            "256.100.50.25",
            "192.168.1",
            "192.168.1.500",
            "1.1.1.1",
            "123.045.067.089"
        };

        for (String ip : testIPs) {
            System.out.println(ip + " → " + (Valid.isValidIP(ip) ? "Valid" : "Invalid"));
        }
    }

    
}

