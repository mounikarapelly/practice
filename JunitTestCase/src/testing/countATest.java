package testing;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class countATest {

	@Test
	void test() {
		
		junitTesting test =new junitTesting();
		int output =test.countA("alphabetic");
		assertEquals(2,output);
	}

}
