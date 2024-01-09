package com.kn.abstraction1;

public abstract class Calculator {
	public int add(int a,int b) {
		return a+b;
	}
	public int sub(int a,int b) {
		return a-b;
	}
	abstract public int mul(int a,int b);
		
	abstract public double div(int a,int b);
		
}
