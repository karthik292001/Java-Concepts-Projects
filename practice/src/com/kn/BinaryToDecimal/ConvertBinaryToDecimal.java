package com.kn.BinaryToDecimal;

public class ConvertBinaryToDecimal {
	public int convertBinaryToDecimal(int binary) {
		int sum=0,rem,i=0;
		while(binary>0) {
			rem=binary%10;
			sum=sum+(int)(Math.pow(2,i)*rem);
			binary=binary/10;
			i++;
		}
		return sum;
	}
}
