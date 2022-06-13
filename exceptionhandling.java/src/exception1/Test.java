package exception1;
public class Test {

	public static void main(String[] args) {
		System.out.println("first line");
		try {
			System.out.println(10/0);
		} catch (Exception e) {
			
			e.printStackTrace();
		}
		System.out.println("last line");



				}

			

		
	}


