package com.kn.fibonacci;

import java.util.Scanner;

public class FibonacciSeries {

	public static void main(String[] args) {
		Scanner read=new Scanner(System.in);
		System.out.println("Enter a range:");
		int range=read.nextInt();
		Fibonacci fibo=new Fibonacci();
		fibo.fibonacciSeries(range);
		read.close();
	}

}
