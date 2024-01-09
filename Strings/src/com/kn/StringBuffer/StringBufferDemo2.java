package com.kn.StringBuffer;

public class StringBufferDemo2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StringBuffer stringBuffer=new StringBuffer("Java");
		System.out.println("Size = "+stringBuffer.length());
		System.out.println("capacity = "+stringBuffer.capacity()+"(already holding size + default capacity(16))");

	}

}
