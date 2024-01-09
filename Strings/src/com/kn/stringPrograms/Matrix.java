package com.kn.stringPrograms;

public class Matrix {

	public static void main(String[] args) {
	    String str="java";
        for(int i=0;i<str.length();i++){
            for(int j=0;j<str.length();j++){
                if(j<=i){
                    System.out.print(str.charAt(j));
                }else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
	}
}
