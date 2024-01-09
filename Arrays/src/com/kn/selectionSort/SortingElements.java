package com.kn.selectionSort;

public class SortingElements {
	public int[] sortingArrayElements(int []array) {
		for(int i=0;i<array.length-1;i++) {
			int index=i,min=array[i];
			for(int j=i+1;j<array.length;j++) {
				if(min>array[j]) {
					index=j;
					min=array[j];
				}
			}
			if(index!=i) {
				int temp=array[i];
				array[i]=array[index];
				array[index]=temp;
			}
		}
		return array;
	}
}
