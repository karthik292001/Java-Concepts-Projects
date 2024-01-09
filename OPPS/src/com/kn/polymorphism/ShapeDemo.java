package com.kn.polymorphism;

public class ShapeDemo {

	public static void main(String[] args) {
		Shape s=new Shape();
		doActivity(s);
		
		s=new Rectangle();
		doActivity(s);
		
		s=new Square();
		doActivity(s);
		
		s=new Circle();
		doActivity(s);
		
	}
	public static void doActivity(Shape s) {
		s.draw();
		System.out.println("Area = "+s.calculateArea());
		System.out.println("************");
		
	}

}
