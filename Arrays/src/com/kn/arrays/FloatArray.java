package com.kn.arrays;

import java.util.Scanner;

public class FloatArray {

	public static void main(String[] args) {
//		Taking size of float array as input from user
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the size of float array:");
		
//		Declaration and creation of float array
		float[] floatArray = new float[scan.nextInt()];
		
//		Reading array elements from user
//		for (int i = 0; i < floatArray.length; i++) {    forward traversing
		for(int i=floatArray.length-1;i>=0;i--) {
			System.out.println("Enter the float data for " + (i+1) + " element of float array:");
			floatArray[i] = scan.nextFloat();
		}
//		Displaying array elements to user
		System.out.println("Float array elements are:");
		for (int i = floatArray.length-1; i >=0; i--) {
			System.out.println((i + 1) + " element of float array: " + floatArray[i]);
		}

	}

}
