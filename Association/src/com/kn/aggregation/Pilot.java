package com.kn.aggregation;

public class Pilot {
	String name;
	double salary;
	public Pilot(String name,double salary) {
		this.name=name;
		this.salary=salary;
	}
	public void fly() {
		System.out.println(this.name+" has starting piloting");
	}
}
