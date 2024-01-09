package com.kn.selection;

import java.util.Scanner;

public class MultipleOfNumber {

	public static void main(String[] args) {
		Scanner read=new Scanner(System.in);
		System.out.println("Enter a number:");
		int num=read.nextInt();
		TablesApp table=new TablesApp();
		table.multiples(num);
		read.close();
	}

}
