package may10;
import skeletons.*;

public class VowelCounter {
	public static void main(String[] args){
		String string = Func.getInputString("Please type in the string you want to count vowels from.");
		char[] vowels = {'a','e','i','o','u'};
		int counter = 0;
		for (int i=0;i<vowels.length;i++){
			for (int i2=0;i2<string.length();i2++){
				if (string.toLowerCase().charAt(i2)==vowels[i]){
					counter++;
				}
			}
		}
		System.out.println("There were "+counter+" vowels in the string \""+string+"\".");
	}
}
