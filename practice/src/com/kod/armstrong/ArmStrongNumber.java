package com.kod.armstrong;

import java.util.Scanner;

public class ArmStrongNumber {

	public static void main(String[] args) {
		Scanner read=new Scanner(System.in);
		System.out.println("Enter a number:");
		int num=read.nextInt();
		ArmStrongCheck armstrong=new ArmStrongCheck();
		System.out.println(armstrong.armStrongCheck(num));
		read.close();
	}
}
