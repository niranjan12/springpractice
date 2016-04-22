package com.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.dao.EmployeeDao;

public class SaveEmployeeTest {

	public static void main(String[] args) {
		ApplicationContext context=new ClassPathXmlApplicationContext("applicationContext_ORM.xml");
		EmployeeDao dao=(EmployeeDao)context.getBean("dao");
		System.out.println(dao);

	}

}
