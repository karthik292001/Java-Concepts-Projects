package com.kn.arrays;

import java.util.Scanner;

public class JaggedArray {

	public static void main(String[] args) {
//		Reading base size as a input from user
		Scanner read=new Scanner(System.in);
		System.out.println("Enter the base size for 2-D Array:");
//		Array declaration and creation
		int [][] array=new int[read.nextInt()][];
//		Reading size for sub-array elements
		for(int i=0;i<array.length;i++) {
			System.out.println("-->Enter the size for array["+i+"] element:");
			array[i]=new int[read.nextInt()];
		}
//		Array Initialization 
		System.out.println("*****Enter the data for Jagged 2-D Array*****");
		for(int i=0;i<array.length;i++) {
			for(int j=0;j<array[i].length;j++) {
				System.out.println("Enter data for array["+i+"]["+j+"] element=");
				array[i][j]=read.nextInt();
			}
		}
//		Displaying array elements
		System.out.println("<<<Array elements>>>");
		for(int i=0;i<array.length;i++) {
			for(int j=0;j<array[i].length;j++) {
				System.out.println("Data in array["+i+"]["+j+"] element= "+array[i][j]);
			}
		}
		
	}

}
