package may09;
import skeletons.*;

public class Search {
	public static void main(String[] args){
//		Create an array that sums all of the numbers in the array and then prints the average.
		int[] array = new int[5];
		boolean found = false;
		for (int i=0;i<5;i++){
			array[i]= Func.getInputInt("Please enter number for value for "+(i+1)+".");
		}
		int value = Func.getInputInt("Please enter the value to search for.");
		for (int i=0;i<5;i++){
			if (array[i]==value){
				found=true;
			}
		}
		if (found){
			System.out.println("Result was found.");
		}
		else{
			System.out.println("Result was not found.");
		}
	}
}
