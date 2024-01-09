package com.kn.arraysMultiplication;

public class ArraysMultiplication {
	public int[][] arraysMultiplication(int[][] array1,int[][] array2) {
		int [][]array=new int[array1.length][array2[0].length];
		for(int i=0;i<array.length;i++) {
			for(int j=0;j<array.length;j++) {
				for(int k=0;k<array1[i].length;k++) {
					array[i][j]+=array1[i][k]*array2[k][j];
				}
			}
			
		}
		return array;
	}

}
