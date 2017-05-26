package may08;
import skeletons.*;

public class FortuneTeller {
	public static void main(String[] args){
//		1. 
//		The Fortune Teller
//		Store the following into variables: number of children, partner's name, geographic location, job title.
//		Output your fortune to the screen like so: "You will be a X in Y, and married to Z with N kids."
		String children, partner, location, job;
		children=Func.getInputString("How many children do you have?");
		partner=Func.getInputString("What's your partner's name?");
		location=Func.getInputString("Where do you live?");
		job=Func.getInputString("What's your job title?");
		System.out.println("You will be a "+job+" in "+location+", and married to "+partner+" with "+children+" kids.");
	}
}
