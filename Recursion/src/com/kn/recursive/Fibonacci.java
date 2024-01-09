package com.kn.recursive;

import java.util.Scanner;

public class Fibonacci {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter a number to find out fibonacci series = ");
		int number=scan.nextInt();
		System.out.println("Fibonacci series upto "+number+" numbers is:");
		for(int i=0;i<number;i++) {
			System.out.print(fibonacci(i)+" ");
		}
	}
	public static int fibonacci(int number) {
		if(number==0 || number==1) {
			return number;
		}else{
			return fibonacci(number-1)+fibonacci(number-2);
		}
	}

}
