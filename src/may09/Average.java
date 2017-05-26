package may09;
import skeletons.*;

public class Average {
	public static void main(String[] args){
//		Create an array that sums all of the numbers in the array and then prints the average.
		int[] array = new int[5];
		int sum = 0;
		String list = "";
		for (int i=0;i<5;i++){
			array[i]= Func.getInputInt("Please enter number for value for "+(i+1)+".");
		}
		for (int i=0;i<5;i++){
			sum=sum+array[i];
		}
		list = Func.arrayToString(array);
		int average = sum/array.length;
		System.out.println("The average of "+list+"is: "+average);
	}
}
