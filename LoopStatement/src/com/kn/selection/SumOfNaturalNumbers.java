package com.kn.selection;

import java.util.Scanner;

public class SumOfNaturalNumbers {

	public static void main(String[] args) {
		Scanner read =new Scanner(System.in);
		System.out.println("Enter a number:");
		int num=read.nextInt();
		int sum=0;
		for(int i=1;i<=num;i++) {
		   sum=sum+i;
		}
		System.out.println("Sum of "+num+" natural numbers is: "+sum);
		read.close();
	}

}
