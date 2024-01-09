import java.util.Scanner;

public class ArraysCommonElements {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the size for array1 =");
		int array1[]=new int[scan.nextInt()];
		System.out.println("Enter the data for array1 elements ");
		for(int i=0;i<array1.length;i++) {
			array1[i]=scan.nextInt();
		}
		System.out.println("Enter the size for array2 =");
		int array2[]=new int[scan.nextInt()];
		System.out.println("Enter the data for array2 elements ");
		
		for(int i=0;i<array2.length;i++) {
			array2[i]=scan.nextInt();
		}
		System.out.println("Intersection elements are ");
		int array[]=intersection(array1,array2);
		for(int i=0;i<array.length;i++) {
			if(array[i]!=0) {
				System.out.println(array[i]);
			}
		}
	}
	public static int[] intersection(int array1[],int array2[]) {
		int finalArray[]=new int[array1.length];
		int m=0;
		for(int i=0;i<array1.length;i++) {
			for(int j=0;j<array2.length;j++) {
				if(array1[i]==array2[j]) {
					finalArray[m]=array1[i];
					m++;
				}
			}
		}
		return finalArray;
	}

}
