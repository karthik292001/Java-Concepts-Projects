
public class WeekDays {

	public void checkDay(int num) {
		if(num==1) {
			System.out.println("Day is Sunday");
		}
		else if(num==2) {
			System.out.println("Day is Monday");
		}
		else if(num==3) {
			System.out.println("Day is Tuesday");
		}
		else if(num==4) {
			System.out.println("Day is Wednesday");
		}
		else if(num==5) {
			System.out.println("Day is Thursday");
		}
		else if(num==6) {
			System.out.println("Day is Friday");
		}
		else if(num==7) {
			System.out.println("Day is Saturday");
		}
		else if(num<1 || num>7) {
			System.out.println("Invalid number, Try with valid Input!");
		}
	}
	

}
