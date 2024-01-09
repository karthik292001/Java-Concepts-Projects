package com.kn.jaggedArray;

import java.util.Scanner;

public class StudentMarks {

	public static void main(String[] args) {
		Scanner read=new Scanner(System.in);
//		System.out.println("Enter the number of colleges");
		int [][]studentMarks=new int[read.nextInt()][];
		for(int i=0;i<studentMarks.length;i++) {
//			System.out.println("Enter the numbers of students in college "+(i+1));
			studentMarks[i]=new int[read.nextInt()];
		}
//		System.out.println("***Enter the marks for each student***");
		for(int i=0;i<studentMarks.length;i++) {
			for(int j=0;j<studentMarks[i].length;j++) {
				studentMarks[i][j]=read.nextInt();
			}
		}
		for(int i=0;i<studentMarks.length;i++) {
			System.out.println("College "+(i+1)+":");
			for(int j=0;j<studentMarks[i].length;j++) {
				System.out.println("Student "+(j+1)+":"+studentMarks[i][j]);
			}
		}
	}

}
