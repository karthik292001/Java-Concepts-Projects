import java.util.Scanner;

public class ReverseNumber {

	public static void main(String[] args) {
		Scanner read=new Scanner(System.in);
		System.out.println("Enter a number:");
		int num=read.nextInt();
		Reverse rev=new Reverse();
		System.out.println("Reverse of a given number is: "+rev.reverseNumber(num));
		read.close();
	}

}
