package com.kn.encapsulation;

public class StudentDemo {

	public static void main(String[] args) {
		Student s1=new Student();
		System.out.println("Student 1:");
		System.out.println("ID = "+s1.getId());
		System.out.println("Name = "+s1.getName());
		System.out.println("Marks = "+s1.getMarks());
		System.out.println("Branch = "+s1.getBranch());
		
		Student s2=new Student(2);
		System.out.println();
		System.out.println("Student 2:");
		System.out.println("ID = "+s1.getId());
		System.out.println("Name = "+s1.getName());
		System.out.println("Marks = "+s1.getMarks());
		System.out.println("Branch = "+s1.getBranch());
		
		Student s3=new Student(3,"karthik");
		System.out.println();
		System.out.println("Student 3:");
		System.out.println("ID = "+s1.getId());
		System.out.println("Name = "+s1.getName());
		System.out.println("Marks = "+s1.getMarks());
		System.out.println("Branch = "+s1.getBranch());
		
		Student s4=new Student(4,"kiran",87);
		System.out.println();
		System.out.println("Student 4:");
		System.out.println("ID = "+s1.getId());
		System.out.println("Name = "+s1.getName());
		System.out.println("Marks = "+s1.getMarks());
		System.out.println("Branch = "+s1.getBranch());
		
		Student s5=new Student(5,"shashi",97,"cse");
		System.out.println();
		System.out.println("Student 5:");
		System.out.println("ID = "+s1.getId());
		System.out.println("Name = "+s1.getName());
		System.out.println("Marks = "+s1.getMarks());
		System.out.println("Branch = "+s1.getBranch());
	}

}
