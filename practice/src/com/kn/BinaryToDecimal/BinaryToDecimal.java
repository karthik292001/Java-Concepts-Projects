package com.kn.BinaryToDecimal;

import java.util.Scanner;

public class BinaryToDecimal {

	public static void main(String[] args) {
		Scanner read=new Scanner(System.in);
		System.out.println("Enter a binary value:");
		int binary=read.nextInt();
		ConvertBinaryToDecimal decimal=new ConvertBinaryToDecimal();
		System.out.println("The decimal value of "+binary+" is: "+decimal.convertBinaryToDecimal(binary));
		read.close();
	}

}
