package com.kn.package2;

import com.kn.package1.Program1;

public class Program5 {
	public void display2() {
		Program1 p=new Program1();
		System.out.println("a = "+p.a);
//		System.out.println("b = "+p.b); only acceessible in same package and child from another package
//		System.out.println("c = "+p.c); only accessible in same package
//		System.out.println("d = "+p.d); only accessiblt in same class
	}

}
