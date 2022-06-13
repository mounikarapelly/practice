package Inhertance;

public class TestMain33 {

	public static void main(String[] args) {
		emp e1=new emp();
		//System.out.println(e1);
		e1.setEmployee_id(1);
		e1.setEmployee_Name("jhon");
		e1.setEmployee_social_security_Number(25000);
		
		e1.EmployeeName("jane smith");
		System.out.println("ID: " + e1.getID());
	      System.out.println("Name: " + e1.employeeName());
	      System.out.println("Balance: " + e1.employeeSalary());
	}

}
