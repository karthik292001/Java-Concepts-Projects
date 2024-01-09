
public class MonthQuaterApp {
	public void monthQuater(String month) {
		switch(month) {
		case "January":
		case "February":
		case "March":
			System.out.println("Month belongs to Quater-4");
			break;
		case "April":
		case "May":
		case "June":
			System.out.println("Month belongs to Quater-1");
			break;
		case "July":
		case "August":
		case "September":
			System.out.println("Month belongs to Quater-2");
			break;
		case "October":
		case "November":
		case "December":
			System.out.println("Month belongs to Quater-3");
			break;
		default:
			System.out.println("Invalid Inpur, Try with valid month!");
		}
	}
}
