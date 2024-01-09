package com.kn.exceptionhandling;

import java.util.Scanner;

public class CalculatorApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		System.out.println("Calculator application started");
		System.out.println("Enter numerator = ");
		int a=scan.nextInt();
		System.out.println("Enter denominator = ");
		int b=scan.nextInt();
		double divide=0.0;
		try {
			divide=a/b;
		}
		catch(Exception e) {
//			e.printStackTrace();
			System.out.println("Exception handled succeessfully");
		}
		System.out.println("Division = "+divide);
		System.out.println("Calculator apllication terminated successfully..!");

	}

}
