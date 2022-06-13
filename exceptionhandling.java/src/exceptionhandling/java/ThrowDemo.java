package exceptionhandling.java;

import java.io.IOException;

public class ThrowDemo {

	public static void main(String[] args)  {
		System.out.println("First Line");
		try {
			throw new ArithmeticException("/ zero");
		} catch (ArithmeticException e) {
			
			  e.printStackTrace();
		}
		System.out.println("Last Line");

	}

}