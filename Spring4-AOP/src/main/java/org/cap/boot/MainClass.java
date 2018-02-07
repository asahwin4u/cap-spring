package org.cap.boot;

import org.cap.config.JavaConfig;
import org.cap.dao.EmployeeDaoImpl;
import org.cap.model.Employee;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainClass {

	public static void main(String[] args) {
	
		//ApplicationContext context=new ClassPathXmlApplicationContext("myBeans.xml");
		AnnotationConfigApplicationContext context=new AnnotationConfigApplicationContext(JavaConfig.class);
		
		EmployeeDaoImpl empDao=context.getBean(EmployeeDaoImpl.class);
		
		empDao.saveEmployee(new Employee(1,"Tom",12000));
		
		Employee emp=empDao.findEmployee(13);
		
		System.out.println(emp);
	}

}
