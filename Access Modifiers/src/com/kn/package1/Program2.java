package com.kn.package1;

public class Program2 extends Program1 {
	public void display2() {
		System.out.println("a = "+a);
		System.out.println("b = "+b);
		System.out.println("c = "+c);
//		System.out.println("d = "+d);     only accessible in same class due to private keyword
	}
}
