package skeletons;
import java.util.Scanner;

public class Func {
	static Scanner input = new Scanner(System.in);

	public static void main(String[] args){
	}
	
	public static String getInputString(String question){
		String var;
		System.out.println(question);
		var = input.nextLine();
		return var;		
	}
	
	public static int getInputInt(String question){
		int var;
		System.out.println(question);
		var = input.nextInt();
		return var;		
	}
	
	public static char getInputChar(String question){
		char var;
		System.out.println(question);
		var = input.next().charAt(0);
		return var;		
	}
	
	public static boolean getInputBoolean(String question){
		boolean var = false, loop;
		System.out.println(question);
		do {
			loop = false;
			String string = input.next().toLowerCase();
			if (string.equals("yes")||string.equals("true")||string.equals("y")||string.equals("t")){
				var = true;
			}
			else if (string.equals("no")||string.equals("false")||string.equals("n")||string.equals("f")){
				var = false;
			}
			else
				loop = true;
		} while (loop);
		return var;		
	}
	

	
	public static int[] getMultiInt(int num,int[] array){
		for (int i = 0; i<num;i++){
			array[i]=getInputInt("Please enter input for value "+(i+1)+".");
		}
		return array;
	}
	
	public static int getMin(int[] array){
		int min = array[0];
		for (int i=0;i<array.length;i++){
			if (array[i]<min){
				min=array[i];
			}
		}
		return min;
	}
	
	public static int getMax(int[] array){
		int max = array[0];
		for (int i=0;i<array.length;i++){
			if (array[i]>max){
				max=array[i];
			}
		}
		return max;
	}
	
	public static String arrayToString(int[] array){
		String list = "";
		for (int i=0;i<5;i++){
			list = list + array[i]+", ";
		}
		return list;
	}
	
	public static int randomInt (int max,int min){
		int rand;
		rand = (int) Math.floor((Math.random() * max) + min);
		return rand;
	}
}
