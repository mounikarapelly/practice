package exception1;

public class Test5 {
	public int m1(int a) {
		try {
			System.out.println("try block willl be executed");
			return 50;
		}
		catch(ArithmeticException ae) {
			System.out.println("catch block will executed");
			
		}
		return 10;
	
	
	
	}
	public static void main(String[] args) {
		Test5 t =new Test5();
		t.m1(5);
		
	}

}
