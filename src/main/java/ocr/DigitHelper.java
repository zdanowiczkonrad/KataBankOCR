package ocr;

/**
 * Helper class for generating input data (cause it sucks to do it by hand in
 * each test...)
 * 
 * @author zdanowiczkonrad
 * 
 */
public class DigitHelper {

	public static final String[] DIGITS = {
	" _     _  _     _  _  _  _  _ ",
	"| |  | _| _||_||_ |_   ||_||_|",
	"|_|  ||_  _|  | _||_|  ||_| _|"
	};
	/**
	 * @param number
	 *            String containing bank account number, ie. "070072772"
	 * @return LCD-like formatted number according to KataBankOCR description
	 */
	public static String generate(String number) {
		String result = "";
		for(int i = 0; i < 3; i++) {
			for (char character : number.toCharArray()) {
				Integer digit = Character.getNumericValue(character);
				result += DIGITS[i].substring(3*digit, 3*digit+3);
			}
			result += "\n";
		}
		// debug information to see how the digit actually looks
		System.out.println(result);
		return result;
	}
	
	public static String $(String number) {
		return generate(number);
	}
}
