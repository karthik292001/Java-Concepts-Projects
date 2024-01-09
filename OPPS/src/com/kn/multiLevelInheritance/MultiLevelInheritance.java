package com.kn.multiLevelInheritance;

public class MultiLevelInheritance {

	public static void main(String[] args) {
		Car c1=new Car();
		c1.drive();
		c1.honk();
		c1.color="black";
		c1.regNumber=101;
		System.out.println("color = "+c1.color);
		System.out.println("Register Number = "+c1.regNumber);
		
		System.out.println();
		System.out.println("SUV car inheriting properties of car class");
		SUVCar c2=new SUVCar();
		c2.drive();
		c2.honk();
		c2.color="white";
		c2.regNumber=201;
		System.out.println("color = "+c2.color);
		System.out.println("Register Number = "+c2.regNumber);
		
		System.out.println();
		System.out.println("XUV700 car inheriting properties of SUV car");
		XUV700Car c3=new XUV700Car();
		c3.drive();
		c3.honk();
		c3.color="black";
		c3.regNumber=301;
		System.out.println("color = "+c2.color);
		System.out.println("Register Number = "+c2.regNumber);
	}

}
