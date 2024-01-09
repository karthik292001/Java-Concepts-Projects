package com.kn.arrays;

import java.util.Scanner;

public class SumOfElements {

	public static void main(String[] args) {
//		Reading size as a input from user
		Scanner read=new Scanner(System.in);
		System.out.println("Enter the size for 1-D Array:");
		int[]array=new int[read.nextInt()];
//		Array Initialization as a input from user
		for(int i=0;i<array.length;i++) {
			System.out.println("Enter the data for array["+i+"] element:");
			array[i]=read.nextInt();
		}
		int sum=0;
//		Calculating sum of array elements
		for(int i=0;i<array.length;i++) {
			sum=sum+array[i];
		}
		System.out.println("Sum of array elements is = "+sum);
//		Release the resource
		read.close();
	}

}
