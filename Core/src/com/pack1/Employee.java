package com.pack1;

public class Employee
{
	private int ID;
	
	private String FirstName ;
	
	private String LastName ;
	
	private int Salary;
	
	public Employee(int ID, String"FirstName",String"LastName",int Salary)
	{
		
		
	}
	
	public  int getID()
	{
		return 10;
	}
	public  String getFirstName()
	{
		return"firstname";
	}
	public String  getLastName()
	{
		return "lastname";
	}
	public String getName()
	{
		return"firstname lastname";
	}
	public int getSalary()
	{
		return 10;
	}
	public void setSalary(int salary)
	{
		this.salary = salary;
	
	}
	public  int getAnnualSalary(int salary)
	{
		return salary*12;
	}
	public  int raiseSalary(int percent)
	{
		return 10;
	}
	public String toString()
	{
		return "Employee[id=+, name=FirstName LastaName, salary=+salary]";
	}
	

}
