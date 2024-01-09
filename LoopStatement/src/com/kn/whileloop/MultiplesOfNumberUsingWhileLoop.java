package com.kn.whileloop;

import java.util.Scanner;

public class MultiplesOfNumberUsingWhileLoop {

	public static void main(String[] args) {
		Scanner read = new Scanner(System.in);
		System.out.println("Enter a number:");
		int num = read.nextInt();
		System.out.println("Multiples of " + num + " in reverse order from 10 to 1:");
		TablesAppUsingWhile table = new TablesAppUsingWhile();
		table.multiplesOfNumber(num);
		read.close();
	}

}
