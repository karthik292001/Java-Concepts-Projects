package com.kn.employeedetails;

public class Employee {
	private int id;
	private String name;
	private double salary;
	private static int idgenerator=1000;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	Employee(String name, double salary) {
		this.id = ++idgenerator;
		this.name = name;
		this.salary = salary;
	}
	

}
