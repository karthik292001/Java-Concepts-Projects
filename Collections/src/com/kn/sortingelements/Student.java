package com.kn.sortingelements;

import java.util.Comparator;

public class Student implements Comparable{
	
	int id;
	String name;
	int marks;
	
	public Student(int id, String name, int marks) {
		super();
		this.id = id;
		this.name = name;
		this.marks = marks;
	}
	
// we have to override compareTo() method by implementing comparable interface to sort objects attributes 
//	based on any attribute

	@Override
	public int compareTo(Object o) {
		if(this.marks<((Student)o).marks) {
			return 1;
		}else if(this.marks>((Student)o).marks) {
		    return -1;
		}else {
			return 0;
		}
	}



//	we have to override toString() method to print attributes of class with reference variable (alt+shift+s+S) 
//  toString method will present inside Object class
	
	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", marks=" + marks + "]";
	}
	
	
	
}
