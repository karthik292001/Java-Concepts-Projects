package com.kn.GCD;

import java.util.Scanner;

public class GCD {

	public static void main(String[] args) {
//		Read input from user
		Scanner read=new Scanner(System.in);
		System.out.println("Enter first number:");
		int number1=read.nextInt();
		System.out.println("Enter second number:");
		int number2=read.nextInt();
//		Object reference variable creation
		GcdOfTwoNumbers gcd=new GcdOfTwoNumbers();
//		Calling gcdOfNumbers method with reference variable and returning gcd value 
		System.out.println("Greatest common divisor of "+number1+" and "+number2+" is: "+gcd.gcdOfNumbers(number1, number2));
//		release resources
		read.close();
		
	}

}
