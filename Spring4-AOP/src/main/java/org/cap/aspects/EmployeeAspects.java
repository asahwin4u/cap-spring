package org.cap.aspects;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;

@Aspect
public class EmployeeAspects {

	@Pointcut("execution (* org.cap.dao.*.*(..))")
	public void myPoints(){
		
	}
	
	@Pointcut("execution (* org.cap.dao.EmployeeDaoImpl.findEmployee(..))")
	public void myExtraPoint(){
		
	}
	
	@Before("execution (* org.cap.dao.EmployeeDaoImpl.*(..))")
	public void callBefore(JoinPoint joinPoint){
		String methodName=joinPoint.getSignature().getName();
		if(methodName.equals("findEmployee") || 
				methodName.equals("saveEmployee")){
		System.out.println("Before Advice Method ....... :" + joinPoint.getSignature().getName());
		}
	}
	
	
	
	@After(value="myPoints()")
	public void callAfter(){
		System.out.println("After Advice Method..........");
	}
	
	@AfterReturning(value="myExtraPoint()",returning="val")
	public void afterMyReturnValue(Object val){
		System.out.println("After My Return Object:" + val);
	}
	
	@AfterThrowing(value="myPoints()",throwing="ex")
	public void afterThrowing(Exception ex){
		System.out.println("After Throwing Exception :" );
		ex.printStackTrace();
	}
	
	
	@Around(value="myExtraPoint()")
	public void aroundMethod(ProceedingJoinPoint pjp) throws Throwable{
		System.out.println("Before Invoke............");
		//Modify Your args
		Object[] objs= pjp.getArgs();
			for(Object obj:objs)
				System.out.println(obj.toString());
			
			objs[0]=10;
			
		pjp.proceed(objs);
		System.out.println("After Invoke............");
	}
	
}
