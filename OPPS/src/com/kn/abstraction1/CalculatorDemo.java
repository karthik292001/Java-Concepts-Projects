package com.kn.abstraction1;

import java.util.Scanner;

public class CalculatorDemo {

	public static void main(String[] args) {
//		Reading input from end user by creating scanner object
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter a first number = ");
		int a=scanner.nextInt();
		System.out.println("Enter a second number = ");
		int b=scanner.nextInt();
//		Creating object of SmartCalculator class to call it's methods and methods of Calculator class. 
		SmartCalculator sm=new SmartCalculator();
//		Printing resultant values after performing calculations
		System.out.println("Addition of "+a+" and "+b+" is = "+sm.add(a,b));
		System.out.println("Subtraction of "+a+" and "+b+" is = "+sm.sub(a,b));
		System.out.println("Multiplication of "+a+" and "+b+" is = "+sm.mul(a,b));
		System.out.println("Division of "+a+" and "+b+" is = "+sm.div(a,b));
//		Release the resource
		scanner.close();
	}

}
