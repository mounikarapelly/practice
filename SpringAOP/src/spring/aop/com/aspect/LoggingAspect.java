package spring.aop.com.aspect;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
@Aspect
public class  LoggingAspect {
	//@Before("execution(public String getName())")
	//@Before("execution(public String spring.aop.com.model.Circle.getName() getName())")
	//@Before("execution(public * get*(*))")
	//@Before("allGetters()")
	@Before("allCircleMethods()")
 public void LoggingAdvice((JoinPoint joinpoint)) {
		
	 System.out.println("advice run.get method called");
 }
	//@Before("allGetters()&& allCircleMehods()")
	//@Before("allGetters()")
	//@Before("execution(*get*())")
	
	//public void secondAdvice() {
	//	System.out.println("second advice executed");
	//}
	@Pointcut("execution(* get*())")
	public void allGetters() {
		
	}
	@Pointcut("execution(* *spring.aop.com.model.Circle.*(..))")
	public void allCircleMehods() {}
	
	
	
}
