package com.pack6;

import org.springframework.beans.factory.annotation.Required;
import org.springframework.beans.factory.annotation.Value;

@SuppressWarnings("unused")
public class Student 
{
	@Value("${student.name}")
	private String name;
	
	@Value("${student.intrestedCourse}")
	private String intrestedCourse;
	
	@Value("${student.hobby}")
	private String hobby;
	
	/*public void setName(String name)
	{
		this.name = name;
		System.out.println("using the set name method");
	}
	
	public void setIntrestedCourse(String intrestedCourse) 
	{
		this.intrestedCourse = intrestedCourse;
		System.out.println("set itrested course");
	}
	@Required
	
	public void setHobby(String hobby)
	{
		this.hobby = hobby;
		System.out.println("hobby is gd for health");
	}*/

	public void displayStudentInfo() 
	{
		System.out.println("student name====>"+name);
		System.out.println("intrestedcourse===>"+intrestedCourse);
		System.out.println("hobby===>"+hobby);
	}
}
