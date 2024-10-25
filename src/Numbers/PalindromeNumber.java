package Numbers;

import java.util.Scanner;

public class PalindromeNumber {
	
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter a number :");
		int num = sc.nextInt();
		
		
		int  rev ;
		int temp=num;
		int sum=0;
		while(temp!=0) {
			
			
			int rem = temp%10;
			sum = sum*10+rem;
			temp/=10;
			
		}
		
		if(num==sum) System.out.println("This number is palindrome");
		else System.out.println("This number is not a palindrome");
		
		
	}

}
