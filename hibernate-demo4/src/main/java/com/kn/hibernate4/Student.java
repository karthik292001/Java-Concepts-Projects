package com.kn.hibernate4;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity
public class Student {
	@Id
	int rollNumber;
	String name;
	int marks;
	@OneToOne
	Bike bike;
	
	public Student(int rollNumber, String name, int marks, Bike bike) {
		super();
		this.rollNumber = rollNumber;
		this.name = name;
		this.marks = marks;
		this.bike = bike;
	}
	public Student() {
		super();
	}
	public int getRollNumber() {
		return rollNumber;
	}
	public void setRollNumber(int rollNumber) {
		this.rollNumber = rollNumber;
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
	public Bike getBike() {
		return bike;
	}
	public void setBike(Bike bike) {
		this.bike = bike;
	}
	@Override
	public String toString() {
		return "Student [rollNumber=" + rollNumber + ", name=" + name + ", marks=" + marks + ", bike=" + bike + "]";
	}
	
	
	
}
