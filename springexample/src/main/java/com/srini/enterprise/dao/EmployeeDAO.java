package com.srini.enterprise.dao;

import com.srini.enterprise.Employee;

public interface EmployeeDAO {

		public void insert(Employee employee);
		public Employee findById(int id);
}
