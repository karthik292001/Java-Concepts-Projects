import java.util.Scanner;

public class WeekDaysSwitch {

	public static void main(String[] args) {
		Scanner read=new Scanner(System.in);
		System.out.println("Enter a number:");
		int num=read.nextInt();
		WeekDayApp day =new WeekDayApp();
		day.weekDays(num);
		read.close();
	}

}
