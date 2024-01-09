package com.kn.comparatorinterface;

import java.util.Comparator;

public class SortingStudentsByID implements Comparator<Student>{

//	Sorting students based on id in ascending order
	@Override
	public int compare(Student s1, Student s2) {
		if(s1.id>s2.id) {
			return 1;
		}else if(s1.id<s2.id) {
			return -1;
		}
		else {
			return 0;
		}
	}
	
	
	//	to Sort students based on id in descending order
	
//	@Override
//	public int compare(Student s1, Student s2) {
//		if(s1.id>s2.id) {
//			return -1;
//		}else if(s1.id<s2.id) {
//			return 1;
//		}
//		else {
//			return 0;
//		}
//	}

}
