package Numbers;

import java.util.Scanner;

public class SumOfDigit {
	
	public static void main(String[] args) {
		
		
		// 1234   = 10  
		
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter a number  :");
		int num= sc.nextInt();
		
		
		int sum = 0 ; 
		
		
		while(num!=0) {
			
			
			int rem = num%10;  // 4
			
			sum = sum + rem;  // 0+4 = 4 , 4+2 
			
			num= num/10;
	
		}
		System.out.println("Answer is :");
		
		
	}

}











