package DSA;

import java.util.Scanner;

public class User {
	
	int u_scr = 0 ;
	int input ;
	String name ;
	
	User(){
		
	}
	
	User(String name){
		this.name = name ;
	}
	
	
	
	
	
		public  int getInput() {
		// TODO Auto-generated method stub
		System.out.println("Enter your input 0 or 1");
		Scanner sc = new Scanner(System.in) ;
		
		int input = sc.nextInt();
		
		if(input<2&&input>=0) {
			
			return input;
			
			
		}
		else {
			System.err.println("Sorry please Enter Valid Input");
			getInput();
			
		
		}
		
		return -1;
	}


}
