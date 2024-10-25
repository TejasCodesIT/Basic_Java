package Numbers;

import java.util.Scanner;

public class Prime {
	
	// 2, 3 , 5 , 7 ,11....
	
	
	public static void main(String[] args) {
		
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Please Enter a number : ");
		int num = sc.nextInt();
		
		
		int flag=0; // 5 
		
		if(num==0 || num == 1) {
			
			System.out.println("It is not a prime number : ");
			
		}
		else {
						
			for(int i = 2 ; i< num ; i++) { // 2,3,4
				
				
				if(num%i == 0) {   //  4
					
					flag=1;
				
					break;
					
				}
				
				
			}
			
			if(flag==0) {
				
				System.out.println("It is prime number ");
				
			}
			else System.out.println("It is not a prime number");
			
			
		}
		
		
		
	}

}
