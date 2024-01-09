package com.kn.selection;


import java.util.Scanner;

public class DecrementingFor {

	public static void main(String[] args) {
				Scanner read =new Scanner(System.in);
				System.out.println("Enter a number:");
				int num=read.nextInt();
				System.out.println("Numbers from "+num+" to 1 is:");
				for(int i=num;i>=1;i--) {
					System.out.println(i);
				}
				read.close();
			}
	}


