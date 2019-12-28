
public class NoOfDaysMonth {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String month=args[0];
		switch (month) {
		case "Jan":
		case "Mar":
		case "May":
		case "Jul":
		case "Aug":
		case "Oct":
		case "Dec":System.out.println("Number of days in the month: 31");
		break;
		case "Feb":System.out.println("Number of days in the month: 28 if a normal year and 29 if leap year");
			break;

		default:System.out.println("Number of days in the month: 30");
			break;
		}
	}

}
