package com.kn.palindrome;

public class PalindromeCheck {
	public String checkPalindrome(int num) {
		int rem,rev=0,temp=num;
		while(num>0) {
			rem=num%10;
			rev=rev*10+rem;
			num=num/10;
		}
		if(temp==rev) {
			return "Given number is palindrome";
			
		}
		else {
			return "Given number is not palindrome";
		}
	}

}
