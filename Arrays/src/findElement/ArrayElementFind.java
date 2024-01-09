package findElement;

import java.util.Scanner;

public class ArrayElementFind {

	public static void main(String[] args) {
		Scanner read=new Scanner(System.in);
		System.out.println("Enter the size for 1-D Array:");
		int[]array=new int[read.nextInt()];
		for(int i=0;i<array.length;i++) {
			System.out.println("Enter the data for array["+i+"] element");
			array[i]=read.nextInt();
		}
		System.out.println("-->Enter the element to search:");
		int element=read.nextInt();
		FindingArrayElement search=new FindingArrayElement();
		System.out.println(element+" is found in array: "+search.findArrayElement(array,element));
		read.close();
	}

}
