package DSA;

import java.util.Random;
import java.util.Scanner;

public class MindGame {
	
	
	
	public static void playGame(int iteration) {
		
		
		
		Random r =new Random();
		User u = new User();
		Computer c = new Computer() ;
		
		
		
		int prediction;
		// TODO Auto-generated method stub

		for(int i =0 ;i<iteration;i++) {
			
			
			 u.input = u.getInput() ;
			
			prediction=(int)r.nextInt(2);
			c.computerPrediction();
						
			if(c.c_pre==prediction) 	c.c_scr++;
			
			if(u.input==prediction) u.u_scr++;
					

			System.out.println("Computer predicction "+c.c_pre);
			System.out.println(" Prediction "+prediction);
		}
		
		System.out.println("***********************************************************");
		
		
		if(u.u_scr>c.c_scr) System.out.println("Congratulation you win");
		
		else if(c.c_scr>u.u_scr) System.err.println("Best luck next time");
		
		else System.out.println("There is tie between you both...!");

	}
	
	
	
	
	
	
}






