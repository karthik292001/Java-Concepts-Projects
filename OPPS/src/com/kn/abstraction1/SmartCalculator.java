package com.kn.abstraction1;

public class SmartCalculator extends Calculator{

	@Override
	public int mul(int a,int b) {
		return a*b;
	}

	@Override
	public double div(int a,int b) {
		return a/b;
	}
	
 }
