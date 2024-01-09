package com.kn.comparatorinterface;

import java.util.Comparator;

public class SortingStudentsByName implements Comparator<Student>{

	@Override
	public int compare(Student s1, Student s2) {
		if(s1.equals(s2)) {
			return 0;
		}else {
			return (s1.name).compareTo(s2.name);
		}
		
	}
	
	
	// to sort students based on name in descending order
	
	
//	@Override
//	public int compare(Student s1, Student s2) {
//		if(s1.equals(s2)) {
//			return 0;
//		}else {
//			return -((s1.name).compareTo(s2.name));
//		}
//		
//	}
	
}
