package com.kn.insertionSort;

import java.util.Scanner;

public class InsertionSort {

	public static void main(String[] args) {
		Scanner read=new Scanner(System.in);
		System.out.println("Enter the size of the array = ");
		int array[]=new int[read.nextInt()];
		System.out.println("****Enter the data for array elements****");
		for(int i=0;i<array.length;i++) {
			array[i]=read.nextInt();
		}
		System.out.println("*****Array elements before sorting*****");
		System.out.print("[");
		for(int i=0;i<array.length;i++) {
			if(i==0) {
				System.out.print(array[i]);
			}else {
				System.out.print(","+array[i]);
			}
		}
		System.out.println("]");
		for(int i=1;i<array.length;i++) {
			int temp=array[i],index=i;
			for(int j=i-1;j>=0;j--) {
				if(temp<array[j]) {
					array[j+1]=array[j];
					index=j;
				}else {
					break;
				}
			}
			array[index]=temp;
		}
		System.out.println("*****Array elements after sorting*****");
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
