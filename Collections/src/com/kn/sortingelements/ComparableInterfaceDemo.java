package com.kn.sortingelements;

import java.util.ArrayList;
import java.util.Collections;

public class ComparableInterfaceDemo {

	public static void main(String[] args) {
		Student s1=new Student(101,"Karthik",89);
		Student s2=new Student(102,"karthi",97);
		Student s3=new Student(103,"karri",95);
		Student s4=new Student(104,"kashi",60);
		
		ArrayList<Student> list=new ArrayList<Student>();
		list.add(s1);
		list.add(s2);
		list.add(s3);
		list.add(s4);
		Collections.sort(list);
		System.out.println("******Sorted list based on marks in descending order******");
		System.out.println(list);
		
	}
}
