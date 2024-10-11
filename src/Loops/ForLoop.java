package Loops;

import java.util.Scanner;

public class ForLoop {
	
	public static void main(String[] args) {
		
		
		
		System.err.println("Please Enter your good Name :)  = ");
		
		Scanner sc = new Scanner(System.in) ;
		
		String name = sc.next();
		
		for(int i = 0 ;  i < name.length();i++) {
			
			
			 System.out.println(name.charAt(i));
		}
		

	}

}
