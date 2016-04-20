package com.service;

import java.util.List;

import com.dto.Employee;

public interface EmployeeService {
	
	public void registerEmployee(Employee e);
	public Employee getEmployeeById(int id);
	public Employee getEmployeeByName(String name);
	public List<Employee> getEmployeeByDept(String dept);
	public List<Employee> getEmployeeByType(String  type);
	
	public void updateEmployee(Employee e);
	public void deleteEmployee(Employee e);
	
	

}
