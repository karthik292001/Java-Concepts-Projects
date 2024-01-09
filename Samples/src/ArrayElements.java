import java.util.Scanner;

public class ArrayElements {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the size for an array");
		int size=scan.nextInt();
		int array[][]=new int[size][size];
		System.out.println("Enter the data for array elements ");
		for(int i=0;i<array.length;i++) {
			for(int j=0;j<array[i].length;j++) {
				array[i][j]=scan.nextInt();
			}
		}
		System.out.println("Array elements are");
		for(int j=0;j<array.length;j++) {
			for(int i=array.length-1;i>=0;i--) {
				System.out.print(array[i][j]+" ");
			}
			System.out.println();
		}
		
	}

}
