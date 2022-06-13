package exceptionhandling.java;
public class Exception {
	public void show1() {
		
		System.out.println("enter the exception");
		
			try {
				System.out.println(10/0);
			} 
			catch (ArithmeticException e) {
				System.out.println("ArithmeticException => " + e.getMessage());
			}
			
			
			catch(NullPointerException e) {
				String s=null;
				
			System.out.println("NullPointerException "+e.getMessage());
		}
		finally {
			System.out.println("finally block executed");
		}
	}
	
	public static void main(String[] args) {
		 Exception e=new Exception();
		 e.show1();
	}

	

}
