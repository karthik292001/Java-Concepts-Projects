import java.util.Scanner;

public class WeekSystem {

	public static void main(String[] args) {
		Scanner read=new Scanner(System.in);
		System.out.println("Enter a number:");
		int num=read.nextInt();
		WeekDays w= new WeekDays();
		w.checkDay(num);
		read.close();
	}

}
