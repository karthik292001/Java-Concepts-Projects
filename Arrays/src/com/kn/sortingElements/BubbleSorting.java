package com.kn.sortingElements;

import java.util.Scanner;

public class BubbleSorting {

	public static void main(String[] args) {
//		Reading array size as input form user 
		Scanner read=new Scanner(System.in);
		System.out.println("Enter the size of Array =");
//		Array declaration and initialization
		int []array=new int[read.nextInt()];
		System.out.println("Enter the data for array elements:");
		for(int i=0;i<array.length;i++) {
			array[i]=read.nextInt();
		}
//		Traversing array elements to print before sorting
		System.out.println("****Array elements before sorting each element****");
		for(int i=0;i<array.length;i++) {
			if(i==0) {
				System.out.print(array[i]);
			}else {
				System.out.print(","+array[i]);
			}
		}
//		calling 
		SortingElements sort=new SortingElements();
		int []swappedArray=sort.sortingArrayElements(array);
		System.out.println("****Array elements after sorting each element****");
		System.out.print("[");
		for(int i=0;i<array.length;i++) {
			if(i==0) {
				System.out.print(swappedArray[i]);
			}else {
				System.out.print(","+swappedArray[i]);
			}
		}
		System.out.print("]");
		read.close();
	}

}
