package com.kn.encapsulation;

public class DogDemo {

	public static void main(String[] args) {
		Dog d1=new Dog();
		System.out.println("Dog 1:");
		d1.setName("Jimmy");
		d1.setColor("white");
		d1.setBread("desi");
		System.out.println("Name  = "+d1.getName());
		System.out.println("Color = "+d1.getColor());
		System.out.println("Bread = "+d1.getBread());
		d1.barking();
		d1.eating();
		
		Dog d2=new Dog("Rockie");
		d2.setColor("black");
		d2.setBread("desi");
		System.out.println();
		System.out.println("Dog 2:");
		System.out.println("Name  = "+d2.getName());
		System.out.println("Color = "+d2.getColor());
		System.out.println("Bread = "+d2.getBread());
		d2.barking();
		d2.eating();
		
		Dog d3=new Dog("Jimmy","Brown");
		d3.setBread("saphard");
		System.out.println();
		System.out.println("Dog 3:");
		System.out.println("Name  = "+d3.getName());
		System.out.println("Color = "+d3.getColor());
		System.out.println("Bread = "+d3.getBread());
		d3.barking();
		d3.eating();
		
		Dog d4=new Dog("Jockie","white","german");
		System.out.println();
		System.out.println("Dog 4:");
		System.out.println("Name  = "+d4.getName());
		System.out.println("Color = "+d4.getColor());
		System.out.println("Bread = "+d4.getBread());
		d4.barking();
		d4.eating();
	}

}
