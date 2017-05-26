package may10;
import skeletons.*;

public class LargestSmallest {
	public static void main(String[] args){
//		Find the largest/smallest of three numbers.
		int[] array = new int[3];
		array=Func.getMultiInt(3, array);
		int min = Func.getMin(array);
		int max = Func.getMax(array);
		String list = Func.arrayToString(array);
		System.out.println("From the numbers "+list+"the greatest number was: "+max+" and the smallest number was: "+min+".");
	}
}
