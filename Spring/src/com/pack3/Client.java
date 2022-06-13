package com.pack3;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Client
{

	public static void main(String[] args) 
	{
		
		ApplicationContext context= new ClassPathXmlApplicationContext("bean.xml");
		System.out.println("bean.xml file loaded");
		Student1 student=context.getBean("stu",Student1.class);
		student.cheating();
		
		AnotherStudent anotherStudent = context.getBean("anotherStudent",AnotherStudent.class);
		anotherStudent.startCheating();
	}

}
