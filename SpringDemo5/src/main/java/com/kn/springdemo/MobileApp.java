package com.kn.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MobileApp {

	public static void main(String[] args) {
		
		ClassPathXmlApplicationContext ctxt =new ClassPathXmlApplicationContext("config.xml");
		
		Mobile mobobj1=(Mobile) ctxt.getBean("mob1");
		System.out.println(mobobj1);
		
		Mobile mobobj2=(Mobile) ctxt.getBean("mob2");
		System.out.println(mobobj2);
		
		Mobile mobobj3=(Mobile) ctxt.getBean("mob3");
		System.out.println(mobobj3);
		
		
		System.out.println();
		Person persobj=(Person) ctxt.getBean("p");
		System.out.println(persobj);
		
		ctxt.close();

	}

}
