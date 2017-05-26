package may22;
import skeletons.*;

public class Blackjack {
	public static void main(String[] args){
		int /*score = 100, bet = Func.getInputInt("How much are you betting?"),*/ val  = 0, player, turn;
		boolean hit = true, bust = false;
		String[][] hand = new String[2][11];
		String out = "";
		
//		score = score - bet;		}
		for (player=0;player < 2; player++) {
			val= 0;
			out = "";
			for (int i = 0; i < 2; i++) {
				hand=hit(hand,player,i);
				if (hand[player][i]!=null){
					hand[player][i]=check(hand[player][i]);
					out =out+ hand[player][i]+" ";
					val = val + Integer.parseInt(hand[player][i]);
				}
			}
			if (player!=0) {
				System.out.println("Your hand is: "+out);
				System.out.println("Your hand equals: "+val);	
			}
//			else {
//				System.out.println("Dealer's hand is: "+out);
//				System.out.println("Dealer's hand equals: "+val);	
//			}
		}
		turn = 3;
		do {
			val= 0;
			out = "";
			hit = Func.getInputBoolean("Would you like to hit?");
			for (player = 0; player < 2; player++) {
				hand=hit(hand,player,turn);
				if (hand[player][turn]!=null){
					hand[player][turn]=check(hand[player][turn]);
					out =out+ hand[player][turn]+" ";
					val = val + Integer.parseInt(hand[player][turn]);
				}		
				if (player!=0) {
					System.out.println("Your hand is: "+out);
					System.out.println("Your hand equals: "+val);	
				}
				if (val>21) {
					bust = true;
				}
//				else {
//					System.out.println("Dealer's hand is: "+out);
//					System.out.println("Dealer's hand equals: "+val);	
//				}		
			}
			turn++;
			
		} while (hit||!bust);
	}
	
	
	public static String check (String hand){
		if ((hand.equals("J"))||(hand.equals("Q"))||(hand.equals("K"))) {
			hand = "10";
		}
		if (hand.equals("A")){
			boolean value = Func.getInputBoolean("Would you like to use the ace as an 11?");
			if (value) {
				hand = "11";
			}
			else{
				hand  = "1";
			}
		}
		return hand;
	}
	
	public static String[][] hit(String[][] hand, int player, int i){
		String[] deck = {"A","A","A","A","2","2","2","2","3","3","3","3","4","4","4","4","5","5","5","5","6","6","6","6","7","7","7","7","8","8","8","8","9","9","9","9","10","10","10","10","J","J","J","J","Q","Q","Q","Q","K","K","K","K",};
		hand[player][i] = deck[Func.randomInt(deck.length, 0)];
		return hand;
	}
}
