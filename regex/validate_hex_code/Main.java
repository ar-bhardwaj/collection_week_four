package regex.validate_hex_code;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] testColors = { "#FFA500", "#ff4500", "#123", "#GGGGGG", "#123456", "#abcdef", "FFA500" };

        for (String color : testColors) {
            System.out.println(color + " → " + (Validate.isValidHexCode(color) ? "Valid" : "Invalid"));
        }
	}

}
