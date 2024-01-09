package com.kn.mergingArrays;

import java.util.Scanner;

public class MergingTwoArrayElements {

	public static void main(String[] args) {
		Scanner read=new Scanner(System.in);
		System.out.println("Enter the size for array1:");
		int []array1=new int[read.nextInt()];
		System.out.println("Enter the size for array2:");
		int []array2=new int[read.nextInt()];
		System.out.println("****Enter the data for array1 elements****");
		for(int i=0;i<array1.length;i++) {
			array1[i]=read.nextInt();
		}
		System.out.println("****Enter the data for array1 elements****");
		for(int i=0;i<array2.length;i++) {
			array2[i]=read.nextInt();
		}
		MergingArrays mergeArrays=new MergingArrays();
		int array3[]=mergeArrays.mergingArrayElements(array1, array2);
		System.out.println("***Elements of array1***");
		System.out.print("[");
		for(int i=0;i<array1.length;i++) {
			if(i==0) {
				System.out.print(array1[i]);
			}else {
				System.out.print(","+array1[i]);
			}
		}
		System.out.print("]");
		System.out.println();
		System.out.println("***Elements of array2***");
		System.out.print("[");
		for(int i=0;i<array1.length;i++) {
			if(i==0) {
				System.out.print(array1[i]);
			}else {
				System.out.print(","+array1[i]);
			}
		}
		System.out.print("]");
		System.out.println();
		System.out.println("***Array elements after merging***");
		System.out.print("[");
		for(int i=0;i<array3.length;i++) {
			if(i==0) {
				System.out.print(array3[i]);
			}else {
				System.out.print(","+array3[i]);
			}
		}
		System.out.print("]");
	}

}
