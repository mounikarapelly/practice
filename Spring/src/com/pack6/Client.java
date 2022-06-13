package com.pack6;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Client {

	public static void main(String[] args) {
		ApplicationContext context= new ClassPathXmlApplicationContext("bean6.xml");
		System.out.println("bean6.xml file loaded");
		Student student=context.getBean("student",Student.class);
		System.out.println(student);
		student.displayStudentInfo();
	}

}












/*
<property name="name" value=" ${student.name}"></property>
<property name="intrestedCourse" value=" ${student.intrestedCourse}"></property>
<property name="hobby" value=" ${student.hobby}"></property>

<property name="name" value=" ${student.name}"></property>
<property name="intrestedCourse" value=" ${student.intrestedCourse}"></property>
<property name="hobby" value=" ${student.hobby}"></property>
*/



