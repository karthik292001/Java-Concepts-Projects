package com.kn.nested;

import java.util.Scanner;

public class FactorialsOfNumber {

	public static void main(String[] args) {
		Scanner read = new Scanner(System.in);
		System.out.println("Enter your number:");
		int num = read.nextInt();
		System.out.println("Factorials of a given number:");
		for (int i = 2; i <= (num / 2); i++) {
			if (num % i == 0) {
				System.out.println(i + " is a factorial of " + num);
			}
		}
		read.close();

	}

}
