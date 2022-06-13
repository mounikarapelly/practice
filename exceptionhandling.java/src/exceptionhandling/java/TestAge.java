package exceptionhandling.java;

import java.util.Scanner;

class TooYoungerException extends RuntimeException
{
	TooYoungerException(String msg){
		
	}
}

class TooOldException extends RuntimeException {
	TooOldException(String msg){
		
	}
}

public class TestAge {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Your Age ");
		int age = sc.nextInt();
		if(age<18) {
			throw new TooYoungerException("You have to wait some more time for voting!");
		}else if(age>60) {
			throw new TooOldException("You have to take care of covid 19");
		}else {
			System.out.println("Welcome to our voting system");
		}

	}

}


