package ocr;

public class Parser {

	private static final String UNKNOWN = "?";

	public String parse(String number) {
		Digit digit = new Digit(number);
		if (!digit.isValid()) {
			return UNKNOWN;
		}
		if (digit.dashes(0)) {
			return "1";
		}
		if (digit.dashes(1)) {
			if (digit.pipes(2))
				return "7";
			else if (digit.pipes(3))
				return "4";
		}

		if (digit.dashes(2)) {
			return "0";
		}
		if (digit.dashes(3)) {

			if (digit.pipes(2)) {
				if (digit.hasBottomPipe())
					return "2";
				else if (digit.hasTopPipe()) {
					return "5";
				}
				return "3";
			} else if (digit.pipes(4)) {
				return "8";
			} else if (digit.hasBottomPipe()) {
				return "6";
			}
			return "9";
		}
		return UNKNOWN;
	}
}
