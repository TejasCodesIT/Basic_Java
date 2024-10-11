package logicOperator;

import java.util.Scanner;

public class ClassGrader {
	
	
	
		public static void main(String[] args) {
			
			Scanner sc = new Scanner(System.in);
			
			System.out.println("Please Enter Grade of student :");
			
			System.out.println(cheakScore(sc.nextInt()));
			
			
		}
		
		private static String cheakScore(int score) {
			// TODO Auto-generated method stub
			
			if(score<=3) return "Failed";
			
			else if(score>3 && score<=5)  return "insufficient" ;
			
			
			else if (score>5&& score<=8) return "Good";
			
			else if (score==10 || score==9) return "Excellent Grade";
			
			else return "Please Enter Valid score between 0 to 10" ;
			
			
			

		}

}
