package Numbers;

import java.util.Scanner;

public class PerfectNumber {
	
	
	public static void main(String[] args) {
		
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter a number : ");
		int num = sc.nextInt();
		
		if (additionOfDivisor(num)==num) {
			System.out.println("It is perfect Number");
			
		}
		
		
	}
	
	
	public static int additionOfDivisor(int num) {
		// TODO Auto-generated method stub
		int sum=0;
		for(int i=1; i<=num/2;i++ ) {
			
			if(num%i==0) {
				sum+=i;
			}
			
		}
		return sum;
		
		

	}

}
