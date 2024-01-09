package com.kn.findingArrayElements;

public class SearchingElement {
	public int binarySearch(int []array,int key) {
		int start=0,end=array.length-1,mid;
		while(start<=end) {
			mid=(start+end)/2;
			if(array[mid]==key) {
				return mid;
			}
			else if(key<array[mid]) {
				end=mid-1;
			}
			else {
				start=mid+1;
			}
		}
		return -1;
	}

}
