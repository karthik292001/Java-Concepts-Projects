package com.kn.springautowiring;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class CarApp {

	public static void main(String[] args) {
		
		ClassPathXmlApplicationContext ctxt=new ClassPathXmlApplicationContext("config.xml");
		
		Engine engobj1=(Engine)ctxt.getBean("eng");
		System.out.println(engobj1);
		
		
		System.out.println();
		Car carobj=(Car) ctxt.getBean("car");
		System.out.println(carobj);
		
		ctxt.close();
	}

}
