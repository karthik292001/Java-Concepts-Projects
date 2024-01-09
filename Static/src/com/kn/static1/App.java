package com.kn.static1;

public class App {
//	static variables
	static int x,y;
	
//	static block
	static {
		System.out.println("Static block");
		x=12;
		y=23;
	}
	
//	static method
	public static void m1() {
		System.out.println("****Static method()***");
		System.out.println("x = "+x);
		System.out.println("y = "+y);
	}
	
//	instance variables
	int a,b;
	
//	instance block
	{
		System.out.println("Instance block");
		a=10;
		b=34;
		x=56;
		y=24;
	}
	
//	instance method
	public void m2() {
		System.out.println("***Instance method()***");
		System.out.println("a = "+a);
		System.out.println("b = "+b);
		System.out.println("x = "+x);
		System.out.println("y = "+y);
	}
	
//	constructor
	public App() {
		System.out.println("constructor of App");
	}
	

}
