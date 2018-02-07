package org.cap.dao;

import org.cap.model.Employee;
import org.springframework.stereotype.Repository;

//@Component
@Repository
public class EmployeeDaoImpl {
	
	public void saveEmployee(Employee employee){
	
		System.out.println("Employee object Saved");
		//throw new NullPointerException("Hey! Its Null value!");
		//int ans=23/0;
	}
	
	public Employee findEmployee(int empId){
		System.out.println("Employee object Found.");
		
		System.out.println("Argument :" + empId);
		return new Employee(1,"Jack",2300);
	}

	
	
}
