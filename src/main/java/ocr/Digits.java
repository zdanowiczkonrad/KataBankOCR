package ocr;

import java.util.ArrayList;
import java.util.List;

public class Digits {

	private String number;

	public Digits(String number) {
		this.number = number;
	}

	public List<Digit> getDigits() {
		ArrayList<Digit> digits = new ArrayList<Digit>();

		String[] digitLines = number.split("\n");
		String extractedDigit = digitLines[0].substring(0, 3) + "\n"
				+ digitLines[1].substring(0, 3) + "\n"
				+ digitLines[2].substring(0, 3) + "\n";

		digits.add(new Digit(extractedDigit));
		if (digitLines[0].length() > 4) {
			extractedDigit = digitLines[0].substring(3, 6) + "\n"
					+ digitLines[1].substring(3, 6) + "\n"
					+ digitLines[2].substring(3, 6) + "\n";
			digits.add(new Digit(extractedDigit));
		}
		return digits;
	}

}
