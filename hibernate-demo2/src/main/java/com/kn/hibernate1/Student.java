package com.kn.hibernate1;

import javax.persistence.Entity;
import javax.persistence.Id;



@Entity
public class Student {
	
	@Id
	int rollnumber;
	String name;
	int marks;
	
	public int getRollnumber() {
		return rollnumber;
	}
	public void setRollnumber(int rollnumber) {
		this.rollnumber = rollnumber;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getMarks() {
		return marks;
	}
	public void setMarks(int marks) {
		this.marks = marks;
	}
	public Student(int rollnumber, String name, int marks) {
		super();
		this.rollnumber = rollnumber;
		this.name = name;
		this.marks = marks;
	}
	public Student() {
		super();
	}
	@Override
	public String toString() {
		return "Student [rollnumber=" + rollnumber + ", name=" + name + ", marks=" + marks + "]";
	}
	

}
