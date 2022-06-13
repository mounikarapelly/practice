package junit5assert;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class Testsample {
	@Test
	public void testA() {
		String expected="Hello";
		String actual="Hello";
		Assertions.assertEquals(expected, actual,"may be values are not equal");
		
	}


}
