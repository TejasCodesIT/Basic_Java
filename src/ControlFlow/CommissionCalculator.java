package ControlFlow;

import java.util.Scanner;

public class CommissionCalculator {
	
	
	public static void main(String[] args) {
		
		
		
		System.out.println("Enter a Sales Range  :- ");
		Scanner sc = new Scanner(System.in);
		
		int sale_range = sc.nextInt();
		
		
		int commission;
		
		
		if(sale_range>10000) {
			
			
			System.out.println("Commisonn with 30% is :- "+calculateCommision(30,sale_range)) ;
			
		}
		else if(sale_range>5000) {
			
		
			
			System.out.println("Commission with 20% is :-  "+calculateCommision(20, sale_range));
			
		}
		else if(sale_range<1000) {
			
			commission=(sale_range*10)/100;
			System.out.println("Commission with 10 % is  : -"+calculateCommision(10, sale_range));
		}
		else System.out.println("You are not applicable for commission");
		
	}
	
	
	private static int calculateCommision(int commission, int sale_range) {
		// TODO Auto-generated method stub
		
		commission=(sale_range*30)/100;
		return commission;

	}
	
	
	
	

}
