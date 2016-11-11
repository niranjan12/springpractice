package com.test;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.dao.EmployeeDao;
import com.dto.Employee;

public class SaveEmployeeTest {

	public static void main(String[] args) {
		ApplicationContext context=new ClassPathXmlApplicationContext("aapplicationContext1.xml");
		EmployeeDao dao=(EmployeeDao)context.getBean("dao");
		Employee e =new Employee();
		e.setEmpType("contract");
		e.setDept("finance");
		e.setAddress("Hyd");
		e.setIsActive("Y");
		e.setJoinDate("Date");
		e.setName("Niranjan Sahu");
		e.setReleveDate("left date");
		e.setSal(40000);
		e.setId(7);
		//dao.registerEmployee(e);
		//dao.updateEmployee(e);
		//Employee emp=dao.getEmployeeByName("Niranjan Sahu");
		List<Employee> emp=dao.getEmployeeByType("contract");
		System.out.println("Employee With Name is :-"+emp.iterator().next().getEmpType());

	}

}
