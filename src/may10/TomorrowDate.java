package may10;
import skeletons.*;

public class TomorrowDate {
	public static void main(String[] args){
//		Given a date (YYYY, MM, DD), find the next date.
		int year, month, day;
		year = Func.getInputInt("What's the year?");
		month = Func.getInputInt("What's the month?");
		day = Func.getInputInt("What's the day?");
		System.out.println("Today is "+year+", "+month+", "+day+" (YYYY, MM, DD).");
		day++;
		if ((month == 2) && (day > 28)){
			day=1;
			month++;
		}
		else if (((month % 2) == 0) && (day > 31)){
			day=1;
			month++;			
		}
		else if (((month%2)!=0) && (day<30)){
			day=1;
			month++;
		}
		if (month > 12){
			year++;
		}
		System.out.println("Today is "+year+", "+month+", "+day+" (YYYY, MM, DD).");
	}
}
