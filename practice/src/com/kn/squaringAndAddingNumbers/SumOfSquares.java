package com.kn.squaringAndAddingNumbers;

public class SumOfSquares {
	public int sumOfSquares(int range) {
		int sum=0;
		for(int i=1;i<=range;i++) {
			sum=(int)(sum+Math.pow(i, 2));
		}
		return sum;
	}
}
