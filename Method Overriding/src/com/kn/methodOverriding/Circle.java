package com.kn.methodOverriding;

public class Circle extends DrawShape{
	double radius=3.9;
	public double calculateArea() {
		double area=Math.PI*radius*radius;
		System.out.println("Area of Circle  = "+area);
		return area;
	}
	public double circumfurance() {
		double circum=2*Math.PI*radius;
		System.out.println("Circumfurance of circle = "+circum);
		return circum;
	}

}
