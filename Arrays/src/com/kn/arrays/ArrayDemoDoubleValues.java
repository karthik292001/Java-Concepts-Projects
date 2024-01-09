package com.kn.arrays;

import java.util.Scanner;

public class ArrayDemoDoubleValues {

	public static void main(String[] args) {
		Scanner read=new Scanner(System.in);
		System.out.println("Enter the size of array:");
		int []array=new int[read.nextInt()];
		System.out.println("Enter the values for array elements:");
		for(int i=0;i<array.length;i++) {
			System.out.println("Enter the value for "+(i+1)+" array element:");
			array[i]=read.nextInt();
		}
		System.out.println("Array elements before doubling each values:");
		for(int i=0;i<array.length;i++) {
			System.out.println((i+1)+" element in array: "+array[i]);
		}
		for(int i=0;i<array.length;i++) {
			array[i]=array[i]*2;
		}
		System.out.println("Array elements after doubling each values:");
		for(int i=0;i<array.length;i++) {
			System.out.println((i+1)+" element in array: "+array[i]);
		}
		read.close();
	}

}
