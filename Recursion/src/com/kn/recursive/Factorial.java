package com.kn.recursive;

import java.util.Scanner;

public class Factorial {

	public static void main(String[] args) {
		Scanner read=new Scanner(System.in);
		System.out.println("Enter a number to find it's factorial =");
		long number=read.nextInt();
		System.out.println("Factorial of "+number+" is = "+factorial(number));
	}
	public static long factorial(long number) {
		if(number==1) {
			return 1;
		}else {
			return number*factorial(number-1);
		}
	}

}
