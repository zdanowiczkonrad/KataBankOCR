package ocr;

public class Digit {

	private String number;

	public Digit(String number) {
		this.number = number;
	}

	boolean hasTopPipe() {
		return number.charAt(4) == '|';
	}

	boolean hasBottomPipe() {
		return number.charAt(8) == '|';
	}

	boolean isValid() {
		return number.length() > 1;
	}

	boolean hasTopDash() {
		return number.charAt(1) == '_';
	}

	public boolean dashes(int expectedCount) {
		return expectedCount == Digit.count(number, "_");
	}

	public boolean pipes(int expectedCount) {
		return expectedCount == Digit.count(number, "|");
	}

	public static int count(String number, String character) {
		return number.length() - number.replace(character, "").length();
	}

}