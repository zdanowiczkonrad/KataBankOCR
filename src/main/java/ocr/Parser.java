package ocr;

public class Parser {

	public String parse(String number) {
		Digits digits = new Digits(number);
		String result = "";
		for (Digit digit : digits.getDigits()) {
			result += digit.getDigit();
		}
		return result;
	}
}
