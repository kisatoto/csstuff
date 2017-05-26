package skeletons;

public class HangmanPrint {
	public static void print(int lives) {
		switch (lives) {
		case 0:
			System.out.println("\n"+
					"   ____\n"+
					"  |    |\n"+
					"  |    o\n"+
					"  |   /|\\\n"+
					"  |    |\n"+
					"  |   / \\\n"+
					" _|_\n"+
					"|   |______\n"+
					"|          |\n"+
					"|__________|\n");
			break;
		case 1:
			System.out.println("\n"+
					"   ____\n"+
					"  |    |\n"+
					"  |    o\n"+
					"  |   /|\\\n"+
					"  |    |\n"+
					"  |   / \n"+
					" _|_\n"+
					"|   |______\n"+
					"|          |\n"+
					"|__________|\n");
			break;
		case 2:
			System.out.println("\n"+
					"   ____\n"+
					"  |    |\n"+
					"  |    o\n"+
					"  |   /|\\\n"+
					"  |    |\n"+
					"  |   \n"+
					" _|_\n"+
					"|   |______\n"+
					"|          |\n"+
					"|__________|\n");
			break;
		case 3:
			System.out.println("\n"+
					"   ____\n"+
					"  |    |\n"+
					"  |    o\n"+
					"  |   /|\n"+
					"  |    |\n"+
					"  |   \n"+
					" _|_\n"+
					"|   |______\n"+
					"|          |\n"+
					"|__________|\n");
			break;
		case 4:
			System.out.println("\n"+
					"   ____\n"+
					"  |    |\n"+
					"  |    o\n"+
					"  |    |\n"+
					"  |    |\n"+
					"  |     \n"+
					" _|_\n"+
					"|   |______\n"+
					"|          |\n"+
					"|__________|\n");
			break;
		case 5:
			System.out.println("\n"+
					"   ____\n"+
					"  |    |\n"+
					"  |    o\n"+
					"  |    \n"+
					"  |    \n"+
					"  |     \n"+
					" _|_\n"+
					"|   |______\n"+
					"|          |\n"+
					"|__________|\n");
			break;
		case 6:
			System.out.println("\n"+
					"   ____\n"+
					"  |    |\n"+
					"  |    \n"+
					"  |  \n"+
					"  |   \n"+
					"  |   \n"+
					" _|_\n"+
					"|   |______\n"+
					"|          |\n"+
					"|__________|\n");
			break;
		default:
			break;
		}
	}
}
