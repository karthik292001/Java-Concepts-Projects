import java.util.Scanner;

public class DoubleTrouble {

	public static void main(String[] args) {
		Scanner read =new Scanner(System.in);
		System.out.println("Enter the number:");
		int num=read.nextInt();
		int result=doubleTheNumber(num);
		System.out.println("The double of given number is:"+result);
	}

	private static int doubleTheNumber(int num) {
		return num+num;
	}

}
