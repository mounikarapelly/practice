package assignment1;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test1 {

	public static void main(String[] args) 
	{
		ApplicationContext context = new ClassPathXmlApplicationContext("bean11.xml");
		
		Customer customer1=context.getBean("customer1",Customer.class);
		Customer customer2=context.getBean("customer2",Customer.class);
		System.out.println();
		System.out.println("via setter injection.......");
		System.out.println("id==="+customer1.getCustomerId());
		System.out.println("name"+customer1.getCustomerName());
		System.out.println("contact==="+customer1.getCustomerContact());
		System.out.println("Address==>"+customer1.getCustomerAddress());
		
		System.out.println();
		System.out.println("via constructor injection===");
		System.out.println("id==="+customer2.getCustomerId());
		System.out.println("name====>"+customer2.getCustomerName());
		System.out.println("contact==="+customer2.getCustomerContact());
		System.out.println("address===="+customer2.getCustomerAddress());
		
	}

}
