package com.kn.spring;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class LaptopApp {

	public static void main(String[] args) {
		
		ClassPathXmlApplicationContext ctxt=new ClassPathXmlApplicationContext("config.xml");
		
		Laptop lap1=(Laptop) ctxt.getBean("lp1");
		System.out.println(lap1);
		
		Laptop lap2=(Laptop) ctxt.getBean("lp2");
		System.out.println(lap2);
	}

}
