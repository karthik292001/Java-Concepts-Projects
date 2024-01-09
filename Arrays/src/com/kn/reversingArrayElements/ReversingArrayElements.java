package com.kn.reversingArrayElements;

import java.util.Scanner;

public class ReversingArrayElements {
	public static void main(String[] args) {
		Scanner read=new Scanner(System.in);
		int [][]array=new int[read.nextInt()][];
		for(int i=0;i<array.length;i++) {
			array[i]=new int[read.nextInt()];
		}
		for(int i=0;i<array.length;i++) {
			for(int j=0;j<array[i].length;j++) {
					array[i][j]=read.nextInt();
			}
		}
		for(int i=0;i<array.length;i++) {
			System.out.println("College "+(i+1)+":");
			for(int j=0;j<array[i].length;j++) {
					System.out.println("student "+(j+1)+":"+array[i][j]);
			}
		}
		read.close();
	}
}
