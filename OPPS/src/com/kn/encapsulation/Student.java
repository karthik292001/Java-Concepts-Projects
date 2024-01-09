package com.kn.encapsulation;

public class Student {
	private int id;
	private String name;
	private int marks;
	private String branch;
	public int getId() {
		return id;
	}
	public String getName() {
		return name;
	}
	public int getMarks() {
		return marks;
	}
	public String getBranch() {
		return branch;
	}
	
//	constructors combination to set values to attributes
	public Student() {
		
	}
	public Student(int id) {
		this.id=id;
	}
	public Student(int id, String name) {
		this.id=id;
		this.name=name;
	}
	public Student(int id, String name,int marks) {
		this.id=id;
		this.name=name;
		this.marks=marks;
	}
	public Student(int id,String name,int marks,String branch) {
		this.id=id;
		this.name=name;
		this.marks=marks;
		this.branch=branch;
	}
	

}
