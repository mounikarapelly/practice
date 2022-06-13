package junit5assert;
import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
public class TestMessage {
	private static final String Assertions = null;
	private Message m;
	private String expected;
	private String actual;
	
	//provide init data
     @BeforeEach
     public void setup() {
    	 m= new Message();
    	 expected ="welcome to :SAM";
    	 actual="";
     }
     
     //do unit test
    
	@Test
	public void testShowMsg() {
		//String expected="welcome to :SAM"; 
		//Message m= new Message();
		// String actual=m.showMsg("SAM");
		
		actual = m.showMsg("SAM");
		assertEquals(expected, actual,"may not be same");
	}
	//clear heap data /clear memory.
	@AfterEach
	public void clean()
	{
		m=null;
		expected=actual=null;
	}
	
}
