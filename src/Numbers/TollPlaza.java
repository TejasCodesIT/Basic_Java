package Numbers;

import java.util.Scanner;

public class TollPlaza {
	
	
	public static void main(String[] args) {
		
		
		int flag=0;
		int choice=0;
		Scanner sc= new Scanner(System.in);
			
		while(flag==0) {
			
			System.out.println("Please Enter a vehicle type \n 1: Car \n 2: Bus \n 3: Truck ");
			
			 choice=sc.nextInt();
			
			if(choice>0 && choice<4) {
				
				flag=1;
				
			}
			else System.err.println("Please Enter valid input...");
			
		}
			
		
		int totalfaire=0;
		
		switch (choice) {
		
		case 1:
			System.out.println("Please Enter how many members are there :");
			int member = sc.nextInt();
			totalfaire= calculateCarToll(member);
					
			break;
			
		case 2:
			
			totalfaire=400;
		   
			 break;
			 
			 
		case 3:
			
			totalfaire=700;
		
		}
		
		
		System.out.println("Your vehicle toll faire is "+totalfaire);
		
		
		
	}
	
	public static int calculateCarToll(int mem ) {
		// TODO Auto-generated method stub
		
		
		
		return 100+(mem*10);
		
		
		
	
	}

}

















