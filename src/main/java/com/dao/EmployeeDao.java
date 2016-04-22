package com.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate3.HibernateTemplate;

import com.dto.Employee;

public class EmployeeDao {
	@Autowired
	private HibernateTemplate template;
	public void registerEmployee(Employee e){
		template.save(e);
		System.out.println("EmployeeObj Stored sucessfully..");
	}
	public Employee getEmployeeById(int id){
		return null;
	}
	public Employee getEmployeeByName(String name){
		return null;
	}
	public List<Employee> getEmployeeByDept(String dept){
		return null;
	}
	public List<Employee> getEmployeeByType(String  type){
		return null;
	}
	
	public void updateEmployee(Employee e){}
	public void deleteEmployee(Employee e){}

}
