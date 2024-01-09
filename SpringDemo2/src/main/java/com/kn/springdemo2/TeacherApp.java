package com.kn.springdemo2;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TeacherApp {

	public static void main(String[] args) {
		ClassPathXmlApplicationContext cptx=new ClassPathXmlApplicationContext("config.xml");
		
		JavaTeacher jtobj=(JavaTeacher)cptx.getBean("jt");
		SQLTeacher stobj=(SQLTeacher)cptx.getBean("st");
		PythonTeacher ptobj=(PythonTeacher)cptx.getBean("pt");
		
		System.out.println(jtobj);
		System.out.println(stobj);
		System.out.println(ptobj);
		
	}

}
