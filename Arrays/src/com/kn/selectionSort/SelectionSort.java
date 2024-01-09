package com.kn.selectionSort;

import java.util.Scanner;

public class SelectionSort {

	public static void main(String[] args) {
		Scanner read=new Scanner(System.in);
		System.out.println("Enter the size of array = ");
		int []array=new int[read.nextInt()];
		System.out.println("Enter the data for array elements:");
		for(int i=0;i<array.length;i++) {
			array[i]=read.nextInt();
		}
		System.out.println("****Array elements before sorting****");
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
		SortingElements sort=new SortingElements();
		int []sortedArray=sort.sortingArrayElements(array);
		System.out.println("****Array elements after sorting using Selection Techique****");
		System.out.print("[");
		for(int i=0;i<sortedArray.length;i++) {
			if(i==0) {
				System.out.print(sortedArray[i]);
			}else {
				System.out.print(","+sortedArray[i]);
			}
		}
		System.out.print("]");
		read.close();
	}

}
