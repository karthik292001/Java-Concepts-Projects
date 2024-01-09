package com.kn.singlerunmethod;

public class MultiThreadingUsingSingleRunMethod {

	public static void main(String[] args) {
		Mythread t1=new Mythread();
		t1.setName("Number");
		t1.start();
		Mythread t2=new Mythread();
		t2.setName("Character");
		t2.start();
	}

}
