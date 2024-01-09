import java.util.Scanner;
import java.util.ArrayList;
public class BestIndex {

	public static void main(String[] args) {
	
		int arr[]= {2,1,3,9,2,4,-10,-9,1,3};
		
		int max=Integer.MIN_VALUE;
		for(int i=0;i<arr.length;i++) {
			int j=2;
			int m=2;
			for(j=i+j;j<arr.length;j=j+m) {
				int sum=0;
					for(int k=i;k<=j;k++) {
					     sum=sum+arr[k];  
					}
					System.out.println(sum);
				if(max<sum) {
					max=sum;
				}
				m++;
			}
		}
		System.out.println("Resultant = "+max);   //(2+1+3+9+2+4=21)
		

	}

}
