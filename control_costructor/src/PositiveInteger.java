import java.util.Scanner;

public class PositiveInteger {

	public static void main(String[] args) {
		Scanner read = new Scanner(System.in);
		System.out.println("Enter a number:");
		int number = read.nextInt();
		if (number > 0) {
			System.out.println(number+" is positive number");
		}
		read.close();
	}
}
