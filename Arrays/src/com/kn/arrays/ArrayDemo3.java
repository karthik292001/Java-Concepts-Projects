package com.kn.arrays;

import java.util.Scanner;

public class ArrayDemo3 {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the size of array:");
		int size=scan.nextInt();
		int []array=new int[size];
		System.out.println("Enter the array Elements:");
		for(int i=0;i<size;i++) {
			array[i]=scan.nextInt();		
		}
		System.out.println("Array elements are:");
		for(int i=0;i<size;i++) {
			System.out.println(array[i]);
      	}
		}

}
