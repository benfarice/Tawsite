package tawsite;

public class SimpleSwitch {

	public static void main(String[] args) {
		
		int monthNumber = 8;
		String monthString ;
		switch (monthNumber) {
		case 1:
			monthString="January";
			break;
		case 2:
			monthString="February";
			break;
		case 3:
			monthString="March";
			break;
		case 4:
			monthString="April";
			break;
		case 5:
			monthString="May";
			break;
		case 6:
			monthString="June";
			break;
		case 7:
			monthString="July";
			break;
		case 8:
			monthString="August";
			break;
		case 9:
			monthString="September";
			break;
		case 10:
			monthString="October";
			break;
		case 11:
			monthString="November";
			break;
		case 12:
			monthString="December";
			break;
		default:
			monthString="There is no such month";
			break;
		}
		
		System.out.println("The month is : "+monthString);
	}

}
