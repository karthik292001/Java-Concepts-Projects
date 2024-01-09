import java.util.Scanner;

public class QuaterMonth {

	public static void main(String[] args) {
		Scanner read = new Scanner(System.in);
		System.out.println("Enter a month:");
		String month=read.next();
		MonthQuaterApp quater=new MonthQuaterApp();
		quater.monthQuater(month);
		read.close();
	}

}
