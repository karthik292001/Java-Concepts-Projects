package com.kn.factorsOfNumber;

import java.util.Scanner;

public class FactorsOfNumber {

	public static void main(String[] args) {
		Scanner read=new Scanner(System.in);
		System.out.println("Enter a number:");
		int number=read.nextInt();
		Factors factors=new Factors();
		factors.factorsOfNumber(number);
		read.close();
	}

}
