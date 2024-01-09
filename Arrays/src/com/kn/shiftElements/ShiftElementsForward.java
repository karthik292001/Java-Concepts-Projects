package com.kn.shiftElements;

import java.util.Scanner;

public class ShiftElementsForward {

	public static void main(String[] args) {
		Scanner read=new Scanner(System.in);
		System.out.println("Enter the size of array=");
		int []array=new int[read.nextInt()];
		System.out.println("Enter the data for array elements:");
		for(int i=0;i<array.length;i++) {
			array[i]=read.nextInt();
		}
		System.out.println("*****Array elements before shifting forward*****");
		System.out.print("[");
		for(int i=0;i<array.length;i++) {
			if(i==0) {
				System.out.print(array[i]);
			}else {
				System.out.print(","+array[i]);
			}
		}
		System.out.print("]");
		int temp=array[array.length-1];
		for(int i=array.length-1;i>0;i--) {
			array[i]=array[i-1];
		}
		System.out.println();
		array[0]=temp;
		System.out.println("*****Array elements after shifting forward*****");
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
