package com.kn.extendskeyword;

public class Mycalculator implements Calculator2{
     int a=10,b=23;

	@Override
	public void add() {
		System.out.println("Addition = "+(a+b));
	}

	@Override
	public void sub() {
		System.out.println("Subtraction = "+(a+b));
		
	}
	
	@Override
	public void mul() {
		System.out.println("Multiplication = "+(a+b));
		
	}

	@Override
	public void div() {
		System.out.println("Division = "+(a+b));
		
	}

	@Override
	public void rem() {
		System.out.println("Remainder = "+(a+b));
		
	}
	
}
