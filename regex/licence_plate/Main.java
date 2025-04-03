package regex.licence_plate;

public class Main {
	public static void main(String[]args) {
		String[] plateNumber = {"AB1234","CD123","ef1234","GH12345"};
		for(String number :plateNumber) {
			System.out.println(number +" - > " + (isValid.isValidPlateNumber(number) ? "valid":"not valid"));
		}
	}
}
