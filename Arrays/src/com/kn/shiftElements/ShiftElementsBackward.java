package com.kn.shiftElements;

import java.util.Scanner;

public class ShiftElementsBackward {

	public static void main(String[] args) {
//		Read the size of array as input from user
		Scanner read=new Scanner(System.in);
		System.out.println("Enter the size of array=");
//		Array declaration and initialization
		int []array=new int[read.nextInt()];
		System.out.println("Enter the data for array elements:");
		for(int i=0;i<array.length;i++) {
			array[i]=read.nextInt();
		}
//		Traversing array elements to print before shifting backwards
		System.out.println("*****Array elements before shifting backwards*****");
		System.out.print("[");
		for(int i=0;i<array.length;i++) {
			if(i==0) {
			System.out.print(array[i]);
			}else {
				System.out.print(","+array[i]);
			}
		}
		System.out.print("]");
		System.out.println();
//		Performing logic to shift array elements backwards
		int temp=array[0];
		for(int i=0;i<array.length-1;i++){
			array[i]=array[i+1];
		}
		array[array.length-1]=temp;
//		Traversing array elements to print after shifting
		System.out.println("*****Array elements after shifting backwards*****");
		System.out.print("[");
		for(int i=0;i<array.length;i++) {
			if(i==0) {
			System.out.print(array[i]);
			}else {
				System.out.print(","+array[i]);
			}
		}
		System.out.print("]");
//		Release the resource
		read.close();
	}

}
