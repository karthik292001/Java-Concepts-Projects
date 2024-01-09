package com.kn.baseAndExponent;

import java.util.Scanner;

public class BaseAndExponent {

	public static void main(String[] args) {
		Scanner read=new Scanner(System.in);
		System.out.println("Enter a Base number:");
		int base=read.nextInt();b
		System.out.println("Enter a Exponent number:");
		int exponent=read.nextInt();
		CalculatePowerOfNumber calculate=new CalculatePowerOfNumber();
		System.out.println("The resultant of "+base+" power "+exponent+" is: "+calculate.calculatePowerOfNumber(base, exponent));
		read.close();
	}

}
