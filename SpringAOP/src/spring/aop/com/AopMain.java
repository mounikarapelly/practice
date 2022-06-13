package spring.aop.com;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import spring.aop.com.service.ShapeService;

public class AopMain {

	public static void main(String[] args) {
		ApplicationContext cts=new ClassPathXmlApplicationContext("spring.xml");
		
		ShapeService shapeService=  cts.getBean("shapeService",ShapeService.class);
		//System.out.println(shapeService.getCircle().getName());
		System.out.println("advice run.Get Method called");
		
	}

}
