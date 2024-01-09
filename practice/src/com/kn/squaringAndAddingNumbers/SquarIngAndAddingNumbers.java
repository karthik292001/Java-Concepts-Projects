package com.kn.squaringAndAddingNumbers;

import java.util.Scanner;

public class SquarIngAndAddingNumbers {

	public static void main(String[] args) {
		Scanner read=new Scanner(System.in);
		System.out.println("Enter a range:");
		int range=read.nextInt();
		SumOfSquares sum=new SumOfSquares();
		System.out.println("Sum of squares of numbers from 1 to "+range+" is: "+sum.sumOfSquares(range));
		read.close();
	}

}
