package com.kn.interface1;

public class StudentDemo {

	public static void main(String[] args) {
		
		Student s1=new CSEStudent();
		s1.study();
		s1.doProject();
		s1=new MechStudent();
		s1.study();
		s1.doProject();
		
	}

}
