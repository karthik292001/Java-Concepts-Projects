package com.kn.shiftElements;

import java.util.Scanner;

public class ShiftingNumberOfElements {

	public static void main(String[] args) {
		Scanner read=new Scanner(System.in);
		System.out.println("Enter the size of array =");
		int []array=new int[read.nextInt()];
		System.out.println("Enter the data for array elements:");
		for(int i=0;i<array.length;i++) {
			array[i]=read.nextInt();
		}
		System.out.println("Enter the number of elements to shift forward =");
		int k=read.nextInt();
		for(int i=0;i<k;i++) {
			int temp=array[array.length-1];
			for(int j=array.length-1;j>0;j--) {
				array[j]=array[j-1];
			}
			array[0]=temp;
		}
		System.out.println("***Array elements after shifting "+k+" elements forward***");
		System.out.print("[");
		for(int i=0;i<array.length;i++) {
			if(i==0) {
				System.out.print(array[i]);
			}else {
				System.out.print(","+array[i]);
			}
		}
		System.out.print("]");
	}

}
