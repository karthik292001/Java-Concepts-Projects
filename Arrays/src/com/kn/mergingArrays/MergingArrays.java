package com.kn.mergingArrays;

public class MergingArrays {
	public int[] mergingArrayElements(int[]array1,int[]array2) {
		int array3[]=new int[array1.length+array2.length];
		int j=0;
		for(int i=0;i<array3.length;i++) {
			if(i>=0 && i<array1.length) {
				array3[i]=array1[i];
			}else {
				array3[i]=array2[j];
				j++;
			}
		}
		return array3;
	}

}
