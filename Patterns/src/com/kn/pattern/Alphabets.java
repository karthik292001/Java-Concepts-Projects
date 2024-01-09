package com.kn.pattern;

import java.util.Scanner;

public class Alphabets {

	public static void main(String[] args) {
		Scanner read=new Scanner(System.in);
		System.out.println("Enter a Alphabet letter to print:");
		char alpha=read.next().charAt(0);
		System.out.println(alpha+" pattern is shown below using '*' :");
		for(int i=1;i<=5;i++) {
			for(int j=1;j<=5;j++) {
				if(j==1||j==5||i==j) {
					System.out.print("*");
				}else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}
	}

}
