package com.kn.compareNumbers;

import java.util.Scanner;

public class CompareNumbers {
	public static void main(String[] args) {
		Scanner read=new Scanner(System.in);
		System.out.println("Enter three numbers:");
		int []numbers=new int[3];
		for(int i=0;i<3;i++) {
			numbers[i]=read.nextInt();
		}
		CheckEqualityNumbers equality=new CheckEqualityNumbers();
		equality.checkEqualityOfNumbers(numbers);
		read.close();
	}

}
