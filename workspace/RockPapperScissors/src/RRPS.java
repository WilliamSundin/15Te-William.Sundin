// William Gabriel Tim
import java.util.Scanner;
import java.util.Random;

public class RRPS {

	public static void main(String[] args) {
		int P;

		Random rand = new Random();
		int C = rand.nextInt(3);
		System.out.println("Rock Paper Scissors!");
		System.out.print("Write 0 for Rock, 1 for Scissors and 2 for paper!");
		Scanner in = new Scanner(System.in);
		P = in.nextInt();
		
		if ((P == 0) && (C == 1) || (P == 1 && C == 2) || (P == 2 && C == 0)) {
			System.out.println("You win?");
			
		}
		else if (P == C) {
			System.out.println("Draw");
		}
		else {
			System.out.println("You suck! Now you know?");
		}
		
		
	}

}
