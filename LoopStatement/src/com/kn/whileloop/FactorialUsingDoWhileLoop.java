package com.kn.whileloop;

import java.util.Scanner;

public class FactorialUsingDoWhileLoop {

	public static void main(String[] args) {
		Scanner read=new Scanner(System.in);
		System.out.println("Enter a number:");
		int num=read.nextInt();
		FactorialApp factorial=new FactorialApp();
		System.out.println("Factorial of "+num+" is: "+factorial.calculateFactorial(num));
		read.close();
		}

}
