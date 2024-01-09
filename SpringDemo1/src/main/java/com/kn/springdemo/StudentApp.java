package com.kn.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class StudentApp {

	public static void main(String[] args) {
		ClassPathXmlApplicationContext cptx=new ClassPathXmlApplicationContext("configuration.xml");
		Student stobj=(Student) cptx.getBean("st");
		System.out.println(stobj);
	}

}
