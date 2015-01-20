package ocr;

import static ocr.DigitHelper.$;
import static org.junit.Assert.*;

import org.assertj.core.api.Assertions;
import org.junit.Test;

public class ParserTest {

	@Test
	public void shouldParseEmptyInputToEmptyString() throws Exception {
		// given:
		Parser parser = new Parser();		
		
		// when:
		String emptyInput = parser.parse("");

		// then:
		Assertions.assertThat(emptyInput).isEqualTo("");
	}
	
	@Test
	public void shouldParseSingleDigit() throws Exception {
		// given:
		Parser parser = new Parser();
 
		// when:
		String zero = parser.parse($("0"));
		// then:
		
		Assertions.assertThat(zero).isEqualTo("0");
	}
}
