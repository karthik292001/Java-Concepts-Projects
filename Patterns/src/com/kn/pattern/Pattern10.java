package com.kn.pattern;

public class Pattern10 {
	public static void main(String[] args) {
		int k=1,l=1;
		for(int i=1;i<=5;i++) {
			if(i%2!=0) {
				k=1;
			}else {
				k=0;
			}
			for(int j=1;j<=9;j++) {
				if(j%2!=0) {
					l=1;
				}else {
					l=0;
				}
				if(j>=(6-i)&&j<=(4+i)&&k==l) {
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
	

