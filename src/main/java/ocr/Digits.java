package ocr;

import java.util.ArrayList;
import java.util.List;

public class Digits {

	private static final int DIGIT_WIDTH = 3;
	private String number;

	public Digits(String number) {
		this.number = number;
	}

	public List<Digit> getDigits() {
		ArrayList<Digit> digits = new ArrayList<Digit>();

		String[] digitLines = number.split("\n");

		int digitCount = digitLines[0].length() / DIGIT_WIDTH;

		for (int i = 0; i < digitCount; i++) {
			String extractedDigit = extractDigit(i, digitLines);
			digits.add(new Digit(extractedDigit));
		}
		return digits;
	}

	private String extractDigit(int digitIndex, String[] digitLines) {

		String extractedDigit = "";
		extractedDigit += extractDigitLine(0, digitLines, digitIndex);
		extractedDigit += extractDigitLine(1, digitLines, digitIndex);
		extractedDigit += extractDigitLine(2, digitLines, digitIndex);
		return extractedDigit;
	}

	private String extractDigitLine(int digitLine, String[] digitLines,
			int digitIndex) {
		int startIndex = digitIndex * DIGIT_WIDTH;
		return digitLines[digitLine].substring(startIndex, startIndex
				+ DIGIT_WIDTH)
				+ "\n";
	}

}
