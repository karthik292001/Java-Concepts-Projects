package com.kn.pattern;

public class Pattern9 {

	public static void main(String[] args) {
		System.out.println("Tilted pyramid pattern");
		for(int i=1;i<=9;i++) {
			for(int j=1;j<=5;j++) {
				if((i<=5&&j<=i)||(i>5&&j<=(10-i))) {
						System.out.print("*");
				}
			    else {
						System.out.print(" ");
					}
			}
			System.out.println();
		}
	}

}
