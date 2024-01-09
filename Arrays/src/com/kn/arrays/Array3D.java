package com.kn.arrays;

import java.util.Scanner;

public class Array3D {

	public static void main(String[] args) {
		Scanner read=new Scanner(System.in);
		System.out.println("Enter the size(m,n,o) for 3-D Array:");
		int m=read.nextInt();
		int n=read.nextInt();
		int o=read.nextInt();
		int[][][]array=new int[m][n][o];
		System.out.println("*****Enter the data for 3-D Array elements*****");
		for(int i=0;i<array.length;i++) {
			for(int j=0;j<array[i].length;j++) {
				for(int k=0;k<array[i][j].length;k++) {
					System.out.println("Enter the data for array["+(i)+"]["+(j)+"]["+(k)+"] element =");
					array[i][j][k]=read.nextInt();
				 	}
				}
		}
		System.out.println("3-D Array elements are:");
		for(int i=0;i<array.length;i++) {
			for(int j=0;j<array[i].length;j++) {
				for(int k=0;k<array[i][j].length;k++) {
					System.out.println("Data in array["+(i)+"]["+(j)+"]["+(k)+"] element = "+array[i][j][k]);
					 	}	
				}
		}
	}

}
