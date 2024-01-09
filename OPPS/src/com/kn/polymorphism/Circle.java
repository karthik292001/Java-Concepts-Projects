package com.kn.polymorphism;

public class Circle extends Shape{
	double radius=2.3;
	public void draw() {
		System.out.println("Circle shape is drawing");
	}
	public double calculateArea() {
		return Math.PI*radius*radius;
	}

}
