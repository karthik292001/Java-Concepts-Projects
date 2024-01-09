import java.util.Scanner;

public class TemperatureConverter {

			public static void main(String[] args) {
				Scanner read=new Scanner(System.in);
				System.out.println("Enter the temperature in fahrenheit:");
				double f=read.nextDouble();
				double result=temperatureConverter(f);
				System.out.println("The resultant temperature in celsius: "+result);
			}
			private static double temperatureConverter(double f) {
				return (f-32)*5/9;
			}

}
