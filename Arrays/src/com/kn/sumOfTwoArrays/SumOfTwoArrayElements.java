package com.kn.sumOfTwoArrays;

import java.util.Scanner;

public class SumOfTwoArrayElements {

	public static void main(String[] args) {
		Scanner read=new Scanner(System.in);
		System.out.println("Enter the size for 1st and 2nd Arrays");
		int size=read.nextInt();
		int []array1=new int[size];
		int []array2=new int[size];
		int []array3=new int[size];
		System.out.println("Enter the data for 1st array elements:");
		for(int i=0;i<array1.length;i++ ) {
			array1[i]=read.nextInt();
		}
		System.out.println("Enter the data for 2nd array elements:");
		for(int i=0;i<array2.length;i++ ) {
			array2[i]=read.nextInt();
		}
        CalculatingSum sumOfArray=new CalculatingSum();
        int array[]=sumOfArray.sumOfTwoArrayElements(array1,array2,array3);
		System.out.println("Sum of two array elements are:");
		for(int i=0;i<array.length;i++ ) {
			System.out.println("sum of array1 element '"+array1[i]+"' and array2 element '"+array2[i]+"' is: "+array[i]);
			read.close();
		}
	}

}
