package com.kn.sumOfTwoArrays;

public class CalculatingSum {
	public int[] sumOfTwoArrayElements(int[]array1,int []array2,int []array3) {
		for(int i=0;i<array3.length;i++ ) {
			array3[i]=array1[i]+array2[i];
		}
		return array3;
	}
}
