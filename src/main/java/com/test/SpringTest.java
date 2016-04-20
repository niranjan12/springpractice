package com.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.dto.SpringDto;

public class SpringTest {  

	public static void main(String[] args) {
       ApplicationContext context=new ClassPathXmlApplicationContext("applicationContext.xml");
       SpringDto dto=(SpringDto) context.getBean("sp");
       dto.sayHello();   
	} 
 
}
