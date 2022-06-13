package com.pack5;

import org.springframework.context.ApplicationContext;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Body 
{

	public static void main(String[] args) 
	{
		@SuppressWarnings("resource")
		ApplicationContext context= new ClassPathXmlApplicationContext("beans1.xml");
		 Human human=context.getBean("human",Human.class);
         human.startPumping();
	}

}
