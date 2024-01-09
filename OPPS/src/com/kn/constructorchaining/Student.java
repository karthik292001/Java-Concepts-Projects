package com.kn.constructorchaining;

public class Student {
	
	int id;
	String name;
	
	public Student() {
		super();
	}

	public Student(String name) {
		super();
		this.name = name;
	}

	public Student(int id) {
		super();
		this.id = id;
	}

	public Student(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}

}
