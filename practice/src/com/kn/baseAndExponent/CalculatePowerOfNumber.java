package com.kn.baseAndExponent;

public class CalculatePowerOfNumber {
	public int calculatePowerOfNumber(int base,int exponent) {
		int result=1;
		for(int i=1;i<=exponent;i++) {
			result=result*base;
		}
		return result;
	}
}
