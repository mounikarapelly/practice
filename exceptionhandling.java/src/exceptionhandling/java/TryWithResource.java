package exceptionhandling.java;

import java.io.FileOutputStream;
import java.io.IOException;

public class TryWithResource {

	public static void main(String[] args) throws IOException {
		try {
			//Creating an object of FileOutputStream to write stream of raw data
			FileOutputStream fos = new FileOutputStream("data.txt");
			//creating a string input
			String str = "Hello This is sample data ";
			byte arr[] = str.getBytes();
			fos.write(arr);
		}catch(ArithmeticException e) {
			e.printStackTrace();
		}
		System.out.println("Resource are closed and message hasbeen written in to the data.txt file");

	}

}