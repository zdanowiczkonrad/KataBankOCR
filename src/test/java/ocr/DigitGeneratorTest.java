package ocr;

import org.assertj.core.api.Assertions;
import org.junit.Test;

public class DigitGeneratorTest {

	@Test
	public void shouldWork() throws Exception {
		// when:
		String actual = DigitGenerator.generate("1234567890123456789");
		// then:
		Assertions.assertThat(actual).isNotEmpty();
		System.out.println("Test output:"+actual);
	}

}
