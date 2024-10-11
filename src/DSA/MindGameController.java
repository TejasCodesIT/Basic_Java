package DSA;

import java.util.Random;
import java.util.Scanner;

public class MindGameController {
	
	public static void main(String[] args) {
		
		
		
		MindGame game = new MindGame();
		
		Scanner sc = new Scanner(System.in) ;
		
		System.out.println("Please Enter iteration of game :=");
		int iteration = sc.nextInt();
		game.playGame(iteration);
		

	
	}

}
