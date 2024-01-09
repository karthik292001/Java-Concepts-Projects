package com.kn.singleInheritance;

public class CarSingleInhetitanceDemo {

	public static void main(String[] args) {
		Car c1=new Car();
		c1.drive();
		c1.honk();
		System.out.println();
		System.out.println("Lamborgini car inheriting properties from it's parent class");
		Lamborgini l1=new Lamborgini();
		l1.drive();
		l1.honk();
	}
	

}
