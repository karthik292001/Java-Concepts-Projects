package com.kn.package2;

import com.kn.package1.Program1;

public class Program4 extends Program1{
	public void display2() {
		System.out.println("a = "+a);
		System.out.println("b = "+b);
//		System.out.println("c = "+c);     only accessible in same package due default modifier
//		System.out.println("d = "+d);     only accessible in same class
	}

}
