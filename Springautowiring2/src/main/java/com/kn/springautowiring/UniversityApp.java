package com.kn.springautowiring;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class UniversityApp {

	public static void main(String[] args) {
		
		ClassPathXmlApplicationContext ctxt=new ClassPathXmlApplicationContext("config.xml");
		
		Professor probj1=(Professor) ctxt.getBean("pr1");
		System.out.println(probj1);
		
		
		
		System.out.println();
		University uniobj=(University) ctxt.getBean("uni");
		System.out.println(uniobj);
	}

}
