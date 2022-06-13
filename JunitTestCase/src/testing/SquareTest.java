package testing;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class SquareTest {

	@Test
	void test() {
		junitTesting test =new junitTesting();
		int output = test.square(5);
		assertEquals(25,output);
	}

}
