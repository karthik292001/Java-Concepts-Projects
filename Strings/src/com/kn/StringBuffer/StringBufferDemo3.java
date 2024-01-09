package com.kn.StringBuffer;

public class StringBufferDemo3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StringBuffer stringBuffer=new StringBuffer(4);
		System.out.println("size = "+stringBuffer.length());
		System.out.println("capacity(Initial capacity passed instead of 16) = "+stringBuffer.capacity());
		System.out.println();
		System.out.println("*****After appending string*****");
		stringBuffer.append("Java");
		System.out.println("Size = "+stringBuffer.length());
		System.out.println("capacity = "+stringBuffer.capacity());
		System.out.println();
        System.out.println("***After appending second string****"); 
		stringBuffer.append("Script");
		System.out.println("Size = "+stringBuffer.length());
		System.out.println("capacity(initial capacity*2 + 2) = "+stringBuffer.capacity());
		
	}

}
