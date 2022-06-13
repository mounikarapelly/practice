package exception.java;

public class UsingException 
{
	
	public static void main(String[] args)
	{
		String s=null; 
		System.out.println("exception started ");
		try {
			System.out.println(10/0);
		}
		catch(ArithmeticException e) {
			  
			System.out.println(s.length());//NullPointerException  
		}
		catch(ArrayIndexOutOfBoundsException ae) {
			int a[]=new int[5];  
			a[10]=50; //ArrayIndexOutOfBoundsException 
		}
      System.out.println("exception ended");
	}
   
}
