package com.kn.pattern;

import java.util.Scanner;

public class pattern {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter number of rows:");
		int rows=scan.nextInt();
		System.out.println("Enter number of columns:");
		int columns=scan.nextInt();
		for(int i=1;i<=rows;i++) {
			for(int j=1;j<=columns;j++) {
				System.out.print((char)(70-i)+" ");
			}
			System.out.println();
		}
	}

}
