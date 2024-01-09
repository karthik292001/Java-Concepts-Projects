package com.kn.matrixAddtion;

import java.util.Scanner;

public class AddingTwoMatrices {

	public static void main(String[] args) {
		Scanner read=new Scanner(System.in);
		System.out.println("Enter the size(rows,columns) for first matrices =");
		int matrix1[][]=new int[read.nextInt()][read.nextInt()];
		System.out.println("Enter the size(rows,columns) for second matrices =");
		int matrix2[][]=new int[read.nextInt()][read.nextInt()];
		System.out.println("Enter the data for matrix1 elements:");
		for(int i=0;i<matrix1.length;i++) {
			for(int j=0;j<matrix1[i].length;j++) {
				matrix1[i][j]=read.nextInt();
			}
		}
		System.out.println("Enter the data for matrix2 elements:");
		for(int i=0;i<matrix1.length;i++) {
			for(int j=0;j<matrix1[i].length;j++) {
				matrix2[i][j]=read.nextInt();
			}
		}
		System.out.println("Elements of matrix1:");
		for(int i=0;i<matrix1.length;i++) {
			for(int j=0;j<matrix1[i].length;j++) {
				System.out.print(matrix1[i][j]+" ");
			}
			System.out.println();
		}
		System.out.println("Elements of matrix2:");
		for(int i=0;i<matrix2.length;i++) {
			for(int j=0;j<matrix2[i].length;j++) {
				System.out.print(matrix2[i][j]+" ");
			}
			System.out.println();
		}
		
		int matrix3[][]=new int[matrix1.length][matrix2.length];
		for(int i=0;i<matrix3.length;i++) {
			for(int j=0;j<matrix3[i].length;j++) {
				matrix3[i][j]=matrix1[i][j]+matrix2[i][j];
			}
		}
		 
		System.out.println("*****Addition of two matrices*****");
		for(int i=0;i<matrix3.length;i++) {
			for(int j=0;j<matrix3[i].length;j++) {
				System.out.print(matrix3[i][j]+" ");
			}
			System.out.println();
		}
	}

}
