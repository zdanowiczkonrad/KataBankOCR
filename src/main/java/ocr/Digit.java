package ocr;

public class Digit {

	private String number;
	static final String UNKNOWN = "?";

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
	
	
	public String toString() {
		return number;
	}

	String getDigit() {
		if (!isValid()) {
			return Digit.UNKNOWN;
		}
		if (dashes(0)) {
			return "1";	
		}
		if (dashes(1)) {
			if (pipes(2))
				return "7";
			else if (pipes(3))
				return "4";
		}
	
		if (dashes(2)) {
			return "0";
		}
		if (dashes(3)) {
	
			if (pipes(2)) {
				if (hasBottomPipe())
					return "2";
				else if (hasTopPipe()) {
					return "5";
				}
				return "3";
			} else if (pipes(4)) {
				return "8";
			} else if (hasBottomPipe()) {
				return "6";
			}
			return "9";
		}
		return Digit.UNKNOWN;
	}

}