package com.kn.springdemo;

public class Person {
	
	Mobile m;
	
	

	public Person() {
		super();
	}

	public Person(Mobile m) {
		super();
		this.m = m;
	}

	public Mobile getM() {
		return m;
	}

	public void setM(Mobile m) {
		this.m = m;
	}

	@Override
	public String toString() {
		return "Person [m=" + m + "]";
	}
	
	
}
