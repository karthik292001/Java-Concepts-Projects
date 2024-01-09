package com.kn.GCD;

public class GcdOfTwoNumbers {
//	definition of gcdOfNumbers method
	public int gcdOfNumbers(int number1,int number2) {
		int gcd=1;
//		Logic part to calculate gcd of two numbers
		for(int i=1;i<=number1&&i<=number2;i++) {
			if(number1%i==0 && number2%i==0) {
				gcd=i;
			}
		}
//		teturning gcd value
		return gcd;
		}
}
