package ocr;

import org.assertj.core.api.Assertions;
import org.junit.Test;

public class DigitHelperTest {

	@Test
	public void shouldWork() throws Exception {
		// when:
		String actual = DigitHelper.generate("897689614");
		// then:
		Assertions.assertThat(actual).isNotEmpty();
		System.out.println("Test output:\n"+actual);
	}

}
