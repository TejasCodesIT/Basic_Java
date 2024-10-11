package ControlFlow;

import java.util.Scanner;

public class MovieDiscount {
	
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Your age");
		
		int fair=7;
		int age= sc.nextInt();
		
		if(age<5&& age>0) {
			
			System.out.println("Congratulation your age is below 5 then you have 60 percent discount enjoy you movie thank you!:"+calculateDiscount(60,fair));
			
		}
		else if(age>60) {
			
			System.out.println("Congratulation your age is above 60 you have 55% discount enjoy you movie thank you!: "+calculateDiscount(55,fair));
			
		}	
		else {
			
			System.out.println("Please enter how many ticket you have to Buy : ");
			int count = sc.nextInt();
			
			if(count==1) System.out.println("Your prise movie ticket prize is 700 ruppes enjoy you movie thank you!");
			
			else {
			  fair*=count;
				
				System.out.println("Your total prize of "+count+" is "+calculateDiscount(30,fair));
			}
			
			
			
		}
		
		
	}
	
	private static double calculateDiscount(int discount,int fair) {
		// TODO Auto-generated method stub
			
		int faire = fair-((discount*fair)/100);
		return faire;
		
		
	}

}
