import java.util.Scanner;

public class LuckyNumber {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter a positive integer =");
		int num = scanner.nextInt();
		boolean result = isLuckyNumber(num);
		if (result) {
			System.out.println("Lucky number");
		} else {
			System.out.println("Not a lucky number");
		}
	}

	public static boolean isLuckyNumber(int number) {
		if (number < 1) {
			return false;
		}
		int count = 2;
		while (count <= number) {
			if (number % count == 0) {
				return false;
			}
			number -= number / count;
			count++;
		}
		if (count > number) {
			return true;
		}
		return false;
	}

}
