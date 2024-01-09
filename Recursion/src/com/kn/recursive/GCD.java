package com.kn.recursive;

import java.util.Scanner;

public class GCD {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a first number = ");
		int num1 = scan.nextInt();
		System.out.println("Enter a second number = ");
		int num2 = scan.nextInt();
		System.out.println("The GCD of "+num1+" and "+num2+" is: "+findGCD(num1, num2));
	}

	public static int findGCD(int num1, int num2) {
		if (num2 == 0) {
			return num1;
		} else {
			return findGCD(num2, num1 % num2);
		}
	}
}
