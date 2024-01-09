package com.kn.jaggedArray;

import java.util.Scanner;

public class AttendanceStatus {

	public static void main(String[] args) {
		Scanner read=new Scanner(System.in);
		System.out.println("Enter the number of companies");
		boolean [][][]attendanceStatus=new boolean[read.nextInt()][][];
		
		for(int i=0;i<attendanceStatus.length;i++) {
			System.out.println("Enter the number of teams for company "+(i+1));
			attendanceStatus[i]=new boolean[read.nextInt()][];
		}
		
		for(int i=0;i<attendanceStatus.length;i++) {
			for(int j=0;j<attendanceStatus[i].length;j++) {
				System.out.println("Enter the number of employees for team "+(j+1)+" of comapany "+(i+1));
				attendanceStatus[i][j]=new boolean[read.nextInt()];
			}
		}
		
		System.out.println("****Enter the boolean data for array elements****");
		for(int i=0;i<attendanceStatus.length;i++) {
			for(int j=0;j<attendanceStatus[i].length;j++) {
				for(int k=0;k<attendanceStatus[i][j].length;k++) {
					attendanceStatus[i][j][k]=read.nextBoolean();
				}
			}
		}
		System.out.println("Attendance status");
		for(int i=0;i<attendanceStatus.length;i++) {
			System.out.println("company "+(i+1)+":");
			for(int j=0;j<attendanceStatus[i].length;j++) {
				System.out.println("Team "+(j+1)+":");
				for(int k=0;k<attendanceStatus[i][j].length;k++) {
					System.out.print(attendanceStatus[i][j][k]+" ");
				}
				System.out.println();
			}
			System.out.println();
		}
		read.close();
	}
}
