package com.kn.comparatorinterface;

import java.util.Comparator;

public class SortingStudentsByMarks implements Comparator<Student>{

	@Override
	public int compare(Student s1, Student s2) {
		if(s1.marks>s2.marks) {
			return 1;
		}else if(s1.marks<s2.marks) {
			return -1;
		}else {
			return 0;
		}
		
	}
	
	
	//to sort students based on marks in descending order
	
//	@Override
//	public int compare(Student s1, Student s2) {
//		if(s1.marks>s2.marks) {
//			return -1;
//		}else if(s1.marks<s2.marks) {
//			return 1;
//		}else {
//			return 0;
//		}
//		
//	}

}
