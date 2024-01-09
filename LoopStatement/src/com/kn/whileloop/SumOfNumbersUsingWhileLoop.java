package com.kn.whileloop;

import java.util.Scanner;

public class SumOfNumbersUsingWhileLoop {

	public static void main(String[] args) {
		Scanner read=new Scanner(System.in);
		System.out.println("Enter a number:");
		int num=read.nextInt();
		SumNumbersApp sum=new SumNumbersApp();
		sum.sumNumbers(num);
		read.close();
		}

}
