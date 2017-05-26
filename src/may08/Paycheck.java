package may08;
import skeletons.*;

public class Paycheck {
	public static void main(String[] args){
//		2.
//		Paycheck Calculator
//		Create a program that accepts pay and hours and outputs the total paycheck amount
		int hours, pay;
		hours = Func.getInputInt("How many hours do you work?");
		pay = Func.getInputInt("How much are you paid? (dollars)");
		System.out.println("You will work for "+hours+" hours and at a rate of $"+pay+" to earn $"+(hours*pay)+".");
	}
}