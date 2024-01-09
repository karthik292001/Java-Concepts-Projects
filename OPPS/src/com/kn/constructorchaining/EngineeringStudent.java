package com.kn.constructorchaining;

public class EngineeringStudent extends Student {
	
	int sem;
	String branch;
	
	public EngineeringStudent() {
		super(101,"karthik");
	}
	public EngineeringStudent(int sem) {
		super();								//calls constructor from parent class
		this.sem = sem;
	}
	public EngineeringStudent(String branch) {
		this(102);								//calls constructor within same class
		this.branch = branch;
	}
	public EngineeringStudent(int sem, String branch) {
		super("kiran");
		this.sem = sem;
		this.branch = branch;
	}
	

}
