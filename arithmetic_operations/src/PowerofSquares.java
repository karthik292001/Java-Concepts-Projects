import java.util.Scanner;

public class PowerofSquares {

	public static void main(String[] args) {
		Scanner read = new Scanner(System.in);
		System.out.println("Enter the number:");
		int num = read.nextInt();
		int result = squareNumber(num);
		System.out.println("The square of given number is:" + result);
		read.close();
	}

	private static int squareNumber(int num) {
		return num * num;
	}

}
