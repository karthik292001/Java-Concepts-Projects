import java.util.Scanner;

public class EvenOrNot {

	public static void main(String[] args) {
		Scanner read = new Scanner(System.in);
		
//		TO read number from End User
		System.out.println("Enter a number:");
		int number = read.nextInt();
		
//		Method to check number is Even or Odd
		checkEvenOrOdd(number);
		read.close();
	}

	private static void checkEvenOrOdd(int number) {
		
//		conditional statement to check whether number is even
		if (number % 2 == 0) {
			System.out.println(number + " is even number");
		}
		
//		statement to print a number is Odd after performing conditional statement
		else {
			System.out.println(number+" is odd number");
		}
		
	}

}
