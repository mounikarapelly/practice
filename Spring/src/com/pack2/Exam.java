package com.pack2;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Exam {
      public static void main(String[] args) {
    	  
	 ApplicationContext context=new ClassPathXmlApplicationContext("beans.xml");
	Student student = context.getBean("Student",Student.class);
	student.displayStudentInfo();
	 
      Student nayan =context.getBean("sree",Student.class);
      nayan.displayStudentInfo();
	
	}
 
}
