package com.kn.comparatorinterface;

import java.util.ArrayList;
import java.util.Collections;

public class ComparatorInterfaceDemo {

	public static void main(String[] args) {
		
		Student s1=new Student(1,"karthik",97);
		Student s2=new Student(2,"sanjay",27);
		Student s3=new Student(3,"shashank",47);
		Student s4=new Student(4,"nachiketh",87);
		Student s5=new Student(5,"chethan",67);
		
		ArrayList<Student> list=new ArrayList<Student>();
		list.add(s1);
		list.add(s2);
		list.add(s3);
		list.add(s4);
		list.add(s5);
		
//		Collections.sort(list,new SortingStudentsByID());
		Collections.sort(list,new SortingStudentsByName());
//		Collections.sort(list,new SortingStudentsByMarks());
		System.out.println(list);
		
	}

}
