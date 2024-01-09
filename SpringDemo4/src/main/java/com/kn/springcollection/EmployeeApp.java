package com.kn.springcollection;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class EmployeeApp {

	public static void main(String[] args) {
		
		ClassPathXmlApplicationContext ctxt=new ClassPathXmlApplicationContext("config.xml");
		
		Employee empobj=(Employee) ctxt.getBean("emp");
		System.out.println(empobj);
		
	}

}
