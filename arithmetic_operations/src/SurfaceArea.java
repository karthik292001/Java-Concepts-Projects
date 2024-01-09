import java.util.Scanner;

public class SurfaceArea {

	public static void main(String[] args) {
		Scanner read = new Scanner(System.in);
		System.out.println("Enter the radius of sphere:");
		double radius = read.nextDouble();
		double result = calculateSurfaceArea(radius);
		System.out.print("The surface area of sphere is: ");
		System.out.printf("%.2f",result);
		read.close();
	}

	private static double calculateSurfaceArea(double radius) {
		double area = 4 * 3.142 * Math.pow(radius, 2);
		return area;
	}

}
