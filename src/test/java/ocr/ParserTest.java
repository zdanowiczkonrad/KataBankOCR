package ocr;

import static ocr.DigitHelper.$;
import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.Assert.*;

import org.junit.Test;

public class ParserTest {

	private Parser parser = new Parser();

	private void assertCorrectParsingFor(String number) {
		assertThat(parser.parse($(number))).isEqualTo(number);
	}

	@Test
	public void parser_0() throws Exception {
		assertCorrectParsingFor("0");
	}

	@Test
	public void parser_1() throws Exception {
		assertCorrectParsingFor("1");
	}

	@Test
	public void parser_2() throws Exception {
		assertCorrectParsingFor("2");
	}

	@Test
	public void parser_3() throws Exception {
		assertCorrectParsingFor("3");
	}

	@Test
	public void characterCounter() throws Exception {
		assertThat(Digit.count("_-_-__", "_")).isEqualTo(4);
	}

	@Test
	public void parser_4() throws Exception {
		assertCorrectParsingFor("4");
	}

	@Test
	public void parser_5() throws Exception {
		assertCorrectParsingFor("5");
	}

	@Test
	public void parser_6() throws Exception {
		assertCorrectParsingFor("6");
	}

	@Test
	public void parser_7() throws Exception {
		assertCorrectParsingFor("7");
	}
	@Test
	public void parser_8() throws Exception {
		assertCorrectParsingFor("8");
	}
	@Test
	public void parser_9() throws Exception {
		assertCorrectParsingFor("9");
	}
}
