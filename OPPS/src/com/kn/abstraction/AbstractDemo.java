package com.kn.abstraction;

public class AbstractDemo {

	public static void main(String[] args) {
		Parent p=new Parent();
		p.m3();
		p.m4();
		p.m1();//static method can not be accessible through object reference
		p.m2();//
	}

}
