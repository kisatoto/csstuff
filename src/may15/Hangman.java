package may15;
import skeletons.*;

public class Hangman {
	//Create a program that will:
	//
	//1. Pick a word randomly from an array of 10 words. 
	//2. Display ' _ _ _ _ ' if there are 4 letters in the word (1 underscore per letter).
	//3. Ask the user to type a letter.
	//4. Search the word for that letter.
	//5. If the letter is found, display that letter in the word. If the letter is not found, reduce lives (initialized to 9) by 1 and tell them to guess again. 
	//6. Continue prompting them to guess a letter until the correct word is formed OR until their lives=0 
	public static void main(String[] args){
		
		String[] words = {"annoyed","optimal","mixed","repair","tempt","reign","animated","question","labored","obtain"};
		String word = words[Func.randomInt(words.length-1, 1)];
		String blank = "";
		boolean found = false;
		int lives = 6, score =0;
		char[] list = new char[word.length()];
		String used = "";
		boolean[] check = new boolean[word.length()];
		boolean loop = false;
		char guess;
		
		//initalize arrays and lists.
		for (int i = 0; i < word.length(); i++) {
			list[i]=word.charAt(i);			
		}

		for (int i = 0; i < word.length(); i++){
			blank = blank + "_ ";
		}

		for (int i = 0; i < word.length(); i++){
			check[i] = true;
		}
		
		
		do {
			HangmanPrint.print(lives);
			do {
				loop = false;
				System.out.println("Your word is below.");
				System.out.println(blank);
				//			System.out.println(word);
				guess = Func.getInputChar("Type in your letter guess.");
				for (int i = 0; i < used.length(); i++) {
					if (used.charAt(i)==guess){
						loop = true;
					}
				}
				if (loop) {
					System.out.println("You have already chosen this character, please choose another.");
				}
			} while (loop);
			
			
			used = used+guess;
			System.out.println("You guessed "+guess+".");
			blank = "";

			for (int i = 0; i < list.length; i++) {
				if (list[i]==guess) {
					found = true;
					score++;
					check[i] = false;
				}
			}
			for (int i = 0; i < word.length(); i++){
				if (check[i]) {
					blank = blank + "_ ";
				}
				else {
					blank = blank + list[i] +" ";
				}
			}
			if (found) {
				System.out.println("Your character was found.");
				found = false;
			} 
			else {
				System.out.println("Your character was not found.");
				System.out.println("You have lost a life.");
				lives--;
			}
		} while (score<word.length()|lives>10);
		System.out.println("Your word is below.");
		System.out.println(blank);
		if (score>=word.length()) {
			System.out.println("You won!");
		}
		else if (lives<=0){
			System.out.println("You lost...");
		}
	}
}
