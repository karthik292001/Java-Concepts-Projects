package com.kn.java8interface;

public class Operations implements Calculator{

	public void add() {
		System.out.println("Addition operation is performing");
	}

	public void sub() {
		System.out.println("Subtraction operation is performing");
		
	}

	public void mul() {
		System.out.println("Multiplication operation is performing");
	}
	Calculator.message();
	
}
