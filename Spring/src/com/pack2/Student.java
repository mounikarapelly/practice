package com.pack2;

public class Student
{
	private int id;
	private String StudentName;
	
	public Student(int id)
	{
		this.id=id;
	}
	
	
	public Student(int id,String studentName) {
		this.id = id;
		this.StudentName = studentName;
		
	}


	/*public void setId(int id) {
		this.id = id;
		System.out.println("setter method called ===>"+id);
	}



	public void setStudentName(String studentName) {
		this.StudentName = studentName;
		System.out.println("setter method====>"+studentName);
	}*/

	
     
    public void displayStudentInfo()
    {
    	System.out.println("student name is :" + StudentName
    			+   " and id is :"   + id);
    }
}
