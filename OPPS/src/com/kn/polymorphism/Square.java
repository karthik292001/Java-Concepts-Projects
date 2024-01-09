package com.kn.polymorphism;

public class Square extends Shape{
	double side=8.3;
	public void draw() {
		System.out.println("Square shape is drawing");
	}
	public double calculateArea() {
		
		return side*side;
	}

}
