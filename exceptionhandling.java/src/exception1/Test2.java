package exception1;

public class Test2 {
	public void ArithmeticException() {
		System.out.println("first line");
		try {
			System.out.println(10/0);
		} catch (Exception e) {
			
			e.printStackTrace();
		}
		System.out.println("last line");
 }
	
	public static void main(String[] args) {
		 Test2 obj=new Test2();
		 obj.ArithmeticException();
	}
}
