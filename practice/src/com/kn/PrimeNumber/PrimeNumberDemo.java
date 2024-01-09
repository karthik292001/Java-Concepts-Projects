package com.kn.PrimeNumber;

import java.util.Scanner;

public class PrimeNumberDemo {

	public static void main(String[] args) {
		Scanner read=new Scanner(System.in);
		System.out.println("Enter a number:");
		int num=read.nextInt();
		CheckPrimeNumber check=new CheckPrimeNumber();
		System.out.println(check.checkPrimeNumber(num));
		read.close();
	}

}
