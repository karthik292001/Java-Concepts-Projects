package com.kn.encapsulation;

public class Dog {
//	Attributes
	private String name;
	private String color;
	private String bread;
	

	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public String getBread() {
		return bread;
	}
	public void setBread(String bread) {
		this.bread = bread;
	}
	
	//	Constructor combinations
	public Dog() {
		
	}
	public Dog(String name) {
		this.name=name;
	}
	public Dog(String name,String color) {
		this.name=name;
		this.color=color;
	}
	public Dog(String name,String color,String bread) {
		this.name=name;
		this.color=color;
		this.bread=bread;
	}
	
//	Behaviors
	public void barking() {
		System.out.println("Bow Bow");
	}
	public void eating() {
		System.out.println("Eating...");
	}
	

}
