package com.kn.arrays;

import java.util.Scanner;

public class StringArray {

	public static void main(String[] args) {
		Scanner read=new Scanner(System.in);
		System.out.println("Enter the size for string array:");
		String[]stringArray=new String[read.nextInt()];
		System.out.println("Enter the string data for string array:");
		for(int i=0;i<stringArray.length;i++) {
			System.out.println("Enter string value for "+(i+1)+" element:");
			stringArray[i]=read.next();
		}
		int count=1;
		System.out.println("String elements are:");
		for(String s: stringArray) {
			System.out.println(count++ +" element of string array: "+s);
		}
	}

}
