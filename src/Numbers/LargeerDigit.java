package Numbers;

import java.util.Scanner;

public class LargeerDigit {
	
	
	
	
	public static void main(String[] args) {
		
		
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter a number : ");
		int num = sc.nextInt();
		int large = 0;
		
		while(num!=0) {
					
			int rem= num%10;
			
			if(rem>large) large=rem;
			
			num/=10;

			
		}
		System.out.println("Larger digit in number is :"+large);
		
		
		
	}
	
	

}
