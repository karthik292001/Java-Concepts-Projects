import java.util.Scanner;

public class JourneyCalculator {

		public static void main(String[] args) {
			Scanner read=new Scanner(System.in);
			System.out.println("Enter the speed:");
			double speed=read.nextDouble();
			System.out.println("Enter the time:");
			double time=read.nextDouble();
			double result=journeycalculator(speed,time);
			System.out.println("The distance traveled is: "+result);
			
		}

		private static double journeycalculator(double speed, double time) {
			return speed*time;
		}

}
