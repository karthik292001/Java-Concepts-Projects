package com.kn.springwiring;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class CompanyApp {

	public static void main(String[] args) {
		
		ClassPathXmlApplicationContext ctxt=new ClassPathXmlApplicationContext("config.xml");
		
		Employee empobj1=(Employee) ctxt.getBean("emp1");
		System.out.println(empobj1);
		Employee empobj2=(Employee) ctxt.getBean("emp2");
		System.out.println(empobj2);
		
		
		System.out.println("***Wiring***");
		CompanyXYZ cmpobj=(CompanyXYZ) ctxt.getBean("cmp1");
		System.out.println(cmpobj);
		
		ctxt.close();
	}

}
