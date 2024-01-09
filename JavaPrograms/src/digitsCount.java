import java.util.Scanner;

public class digitsCount {

	public static void main(String[] args) {
		Scanner read=new Scanner(System.in);
		System.out.println("Enter a number:");
		int num=read.nextInt();
		int temp=num;
		int count=0;
		while(num>0) {
			num=num/10;
			count++;
		}
		System.out.println("Number of digits in "+temp+" is: "+count);
	}

}
