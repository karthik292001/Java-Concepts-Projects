package com.kn.methodOverriding;

public class OverridenDemo {

	public static void main(String[] args) {
		DrawShape s=new DrawShape();
		s.drawShape();
		s.calculateArea();
		
		Circle c=new Circle();
		c.drawShape();
		c.calculateArea();
		c.circumfurance();
	}

}
