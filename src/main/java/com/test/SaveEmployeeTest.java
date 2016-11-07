package com.test;

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
		e.setName("Makara");
		e.setReleveDate("left date");
		e.setSal(35000);
		dao.registerEmployee(e);
		System.out.println(dao);

	}

}
