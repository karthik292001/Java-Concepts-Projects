import java.util.Scanner;

public class CubeNumber {
			public static void main(String[] args) {
				Scanner read = new Scanner(System.in);
				System.out.println("Enter the number:");
				int num = read.nextInt();
				int result = cubeNumber(num);
				System.out.println("The cube of given number is:" + result);
				read.close();
			}

			private static int cubeNumber(int num) {
				return (int)Math.pow(num,3);
			}
	}


