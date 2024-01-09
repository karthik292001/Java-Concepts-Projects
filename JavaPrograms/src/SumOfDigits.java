import java.util.Scanner;

public class SumOfDigits {

	public static void main(String[] args) {
		Scanner read=new Scanner(System.in);
		System.out.println("Enter a number:");
		int num=read.nextInt();
		int digit,sum=0;
		while(num>0) {
			digit=num%10;
			sum=sum+digit;
			num=num/10;
		}
		System.out.println("Sum of digits is: "+sum);
	}

}
