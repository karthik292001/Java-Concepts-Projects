package com.kod.armstrong;

public class ArmStrongCheck {
	public String armStrongCheck(int num) {
		int temp=num;
		int rem,cal=0;
		while(num>0) {
			rem=num%10;
			cal=(int)(cal+Math.pow(rem,3));
			num=num/10;
		}
		if(cal==temp) {
			return "Given number is a ArmStrong Number";
		}
		else {
			return "Given number is not a ArmStrong Number";
		}
	
	}
}
