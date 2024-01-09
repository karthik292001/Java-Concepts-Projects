package com.kn.springdemo2;

public class JavaTeacher {
	
	String name;
	String skill;
	int salary;
	public JavaTeacher() {
		super();
	}
	public JavaTeacher(String name, String skill, int salary) {
		super();
		this.name = name;
		this.skill = skill;
		this.salary = salary;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getSkill() {
		return skill;
	}
	public void setSkill(String skill) {
		this.skill = skill;
	}
	public int getSalary() {
		return salary;
	}
	public void setSalary(int salary) {
		this.salary = salary;
	}
	@Override
	public String toString() {
		return "JavaTeacher [name=" + name + ", skill=" + skill + ", salary=" + salary + "]";
	}
	
	
}
