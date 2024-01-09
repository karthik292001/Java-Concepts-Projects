package com.kn.arrays;

import java.util.Scanner;

public class CharArray {

	public static void main(String[] args) {
		Scanner read=new Scanner(System.in);
		System.out.println("Enter the size for character array:");
		char[]characterArray=new char[read.nextInt()];
		System.out.println("Enter the character array elements:");
		for(int i=0;i<characterArray.length;i++) {
			System.out.println("Enter value for "+(i+1)+" element of array: "+characterArray[i]);
			characterArray[i]=read.next().charAt(0);
		}
		System.out.println("Character array elements are:");
		for(int i=0;i<characterArray.length;i++) {
			System.out.println((i+1)+" element of array: "+characterArray[i]);
		}
		
	}

}
