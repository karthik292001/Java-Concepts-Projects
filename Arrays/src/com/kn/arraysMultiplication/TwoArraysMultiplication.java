package com.kn.arraysMultiplication;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class TwoArraysMultiplication {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner read=new Scanner(System.in);
		System.out.println("Enter size of 1st Array:");
		System.out.print("Rows =");
		int rows=read.nextInt();
		System.out.print("columns =");
		int columns=read.nextInt();
		int[][]array1=new int[rows][columns];
		System.out.println("Enter size of 2nd Array:");
		System.out.print("Rows =");
		rows=read.nextInt();
		System.out.print("columns =");
		columns=read.nextInt();
		System.out.println("Enter the data for array1 elements:");
		int[][]array2=new int[rows][columns];
		for(int i=0;i<array1.length;i++) {
			for(int j=0;j<array1[i].length;j++) {
				array1[i][j]=read.nextInt();
			}
		}
		System.out.println("Enter the data for array2 elements:");
		for(int i=0;i<array2.length;i++) {
			for(int j=0;j<array2[i].length;j++) {
				array2[i][j]=read.nextInt();
			}
		}
		ArraysMultiplication multiplication=new ArraysMultiplication();
		if(array1[0].length==array2.length) {
			int [][]array=multiplication.arraysMultiplication(array1, array2);
			System.out.println("***Resultant array elements after performing multiplication of two arrays***");
			for(int i=0;i<array.length;i++) {
				System.out.print("[");
				for(int j=0;j<array[i].length;j++) {
					System.out.print(array[i][j]+" ");
				}
				System.out.println("]");
			}
		}else {
			System.out.println("Arrays size(rows,columns) are not equal, mutliplication can not be perform!!!!");
		}
		read.close();
		
	}

}
