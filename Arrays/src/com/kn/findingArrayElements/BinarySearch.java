package com.kn.findingArrayElements;

import java.util.Scanner;

public class BinarySearch {

	public static void main(String[] args) {
//		Take size of array as input from user
		Scanner read=new Scanner(System.in);
		System.out.println("Enter the size for Array = ");
//		Array declaration and creation
		int []array=new int[read.nextInt()];
//		Array Initialization
		System.out.println("*****Enter the data for array elemets*****");
		for(int i=0;i<array.length;i++) {
			System.out.println("Enter the data for array element "+(i+1)+":");
			array[i]=read.nextInt();
		}
//		sorting array elements
		int temp;
		for(int i=0;i<array.length-1;i++) {
			for(int j=0;j<array.length-1;j++) {
				if(array[j]>array[j+1]) {
					temp=array[j];
					array[j]=array[j+1];
					array[j+1]=temp;
				}
			}
		}
//	    Traversing array to print array elements 
		System.out.println("Array elements after sorting");
		for(int i=0;i<array.length;i++) {
			System.out.println(array[i]);
		}
//		Reading key element to search as a input from end user
		System.out.println("Enter the element to search =");
		int key=read.nextInt();
//		Calling method to search element in array using binary search
		SearchingElement search=new SearchingElement();
		int index=search.binarySearch(array,key);
		if(index>=0) {
			System.out.println("Element "+key+" found at array position "+(index+1));
		}else {
			System.out.println("Element "+key+" not found, Enter a valid key!");
		}
//		Release resources
		read.close();
	}

}
