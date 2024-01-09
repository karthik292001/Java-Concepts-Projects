package com.kn.selection;
import java.util.Scanner;

public class Numbers {

	public static void main(String[] args) {
		Scanner read =new Scanner(System.in);
		System.out.println("Enter a number:");
		int num=read.nextInt();
		System.out.println("Numbers from 1 to "+num);
		for(int i=1;i<=num;i++) {
			System.out.println(i);
		}
		
		read.close();
	}

}
