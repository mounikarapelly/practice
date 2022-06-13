package com.pack1;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.pack2.Student;

public class Mobile 
{
      public static void main(String[] args) 
      {
    	  ApplicationContext context=new ClassPathXmlApplicationContext("beans.xml");
    	  System.out.println("config loaded");
    	  Student sree= context.getBean("student",Student.class);
    	  sree.displayStudentInfo();
      	
	  }
	
	
	
	
}
