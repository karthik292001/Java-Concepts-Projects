package com.kn.arrays;

import java.util.Scanner;

public class Array2D {

	public static void main(String[] args) {
		Scanner read=new Scanner(System.in);
		System.out.println("Enter the size(m,n) for 2-D Array:");
		System.out.print("m=");
		int m=read.nextInt();
		System.out.print("n=");
		int n=read.nextInt();
		int[][]array=new int[m][n];
		System.out.println("--->Enter the data for 2-D Array elements<---");
		for(int i=0;i<array.length;i++) {
			for(int j=0;j<array[i].length;j++) {
				System.out.println("Enter data for array["+i+"]["+j+"] element= ");
				array[i][j]=read.nextInt();
				}
		}
		System.out.println("2-D Array elements are:");
		for(int i=0;i<array.length;i++) {
			for(int j=0;j<array[i].length;j++) {
				System.out.println("Data in array["+i+"]["+j+"] element= "+array[i][j]);
				}
		}
	}

}
