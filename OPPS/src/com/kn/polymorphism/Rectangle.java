package com.kn.polymorphism;

public class Rectangle extends Shape{
	double height=10;
	double width=1.2;
	public void draw() {
		System.out.println("Rectangle shape is drawing");
	}
	public double calculateArea() {
		return height*width;
	}
}
