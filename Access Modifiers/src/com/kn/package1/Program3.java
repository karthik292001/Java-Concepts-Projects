package com.kn.package1;

class Program3 {
	public void display2() {
		Program1 p=new Program1();
		System.out.println("a = "+p.a);
		System.out.println("b = "+p.b);
		System.out.println("c = "+p.c);
//		System.out.println("d = "+p.d); not accessible due to private keyword
	}
}
