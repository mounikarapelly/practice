package exceptionhandling.java;

public class PredefinedException {

	public static void main(String[] args) {
		int a=10,b=5,c=5,x,y;
		System.out.println("exception started");
		try {
			x=a/(b-c);
			System.out.println("x value"+x);
		}
		catch(ArithmeticException ae)
		{
		System.out.println("division by zero");	
		}
		y=a/(b+c);
		System.out.println("y value=====>"+y);
	}

}
