package ocr;

/**
 * Helper class for generating input data (cause it sucks to do it by hand in
 * each test...)
 * 
 * @author zdanowiczkonrad
 * 
 */
public class DigitGenerator {

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
		String result = "\n";
		for(int i = 0; i < 3; i++) {
			for (char character : number.toCharArray()) {
				Integer digit = Character.getNumericValue(character);
				result += DIGITS[i].substring(3*digit, 3*digit+3);
			}
			result += "\n";
		}
		return result;
		
	}
}
