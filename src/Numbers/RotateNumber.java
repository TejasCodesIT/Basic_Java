package Numbers;

import java.util.Scanner;

public class RotateNumber {
	// 1234 
	
	public static void main(String[] args) {
		
		Scanner sc =new Scanner(System.in);
		// 12   ------   321 
		
		
		System.out.println("Enter a NUmber : ");  //123
		int num = sc.nextInt();
		
		int rev=0;
		
		while(num!=0) {
			
			int rem = num%10; // 3, 2 , 1
			
			rev = rev*10+rem;  //0*10=0+3 ||  rev=3*10=30 , 30+2=320 == 321
			
			num =num/10;   //num =12   .. 1   .. 0
			
			
			
			
		}
		
		System.out.println("Reverse number is :" +rev);
		
		
		
		
		
		
	}
}
