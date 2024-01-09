
public class WeekDayApp {

	public void weekDays(int choice) {
		switch(choice) {
		case 1:
			System.out.println("Day is sunday");
			break;
		case 2:
			System.out.println("Day is Monday");
			break;
		
		case 3:
			System.out.println("Day is Tuesday");
			break;
		
		case 4:
			System.out.println("Day is Wednesday");
			break;
		
		case 5:
			System.out.println("Day is Thursday");
			break;
		
		case 6:
			System.out.println("Day is Friday");
			break;
		
		case 7:
			System.out.println("Day is Saturday");
			break;
		
		default:
			System.out.println("Invalid input, Out of week days!");
		
		}
	}

}
