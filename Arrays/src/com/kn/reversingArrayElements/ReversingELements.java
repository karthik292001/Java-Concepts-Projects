package com.kn.reversingArrayElements;

public class ReversingELements {
	public int[] reverseArrayElement(int[] array) {
		int temp,n=1,count=0;
		for(int i=0;i<array.length-1;i++) {
			temp=array[count];
			for(int j=0;j<array.length-n;j++) {
				array[j]=array[j+1];
				array[j+1]=temp;
			}
			n++;
		}
		return array;
	}

}
