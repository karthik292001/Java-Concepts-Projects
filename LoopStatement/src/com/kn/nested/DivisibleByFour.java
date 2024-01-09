package com.kn.nested;

import java.util.Scanner;

public class DivisibleByFour {
	public static void main(String[] args) {
		Scanner read=new Scanner(System.in);
		System.out.println("Enter a number:");
		int num=read.nextInt();
		System.out.println("Numbers divisible by 4 and are Even:");
		for(int i=1;i<=num;i++) {
			if(i%2==0) {
				if(i%4==0) {
					System.out.println(i+" is a even number");
					System.out.println(i+" is divisible by 4");
				}
			}
		}
	}

}
