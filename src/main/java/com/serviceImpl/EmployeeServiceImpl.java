package com.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.dao.EmployeeDao;
import com.dto.Employee;
import com.service.EmployeeService;

public class EmployeeServiceImpl implements EmployeeService{
    @Autowired
	public EmployeeDao dao;
	public void registerEmployee(Employee e) {
		dao.registerEmployee(e);
	}

	public Employee getEmployeeById(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	public Employee getEmployeeByName(String name) {
		// TODO Auto-generated method stub
		return null;
	}

	public List<Employee> getEmployeeByDept(String dept) {
		// TODO Auto-generated method stub
		return null;
	}

	public List<Employee> getEmployeeByType(String type) {
		// TODO Auto-generated method stub
		return null;
	}

	public void updateEmployee(Employee e) {
		// TODO Auto-generated method stub
		
	}

	public void deleteEmployee(Employee e) {
		// TODO Auto-generated method stub
		
	}

}
