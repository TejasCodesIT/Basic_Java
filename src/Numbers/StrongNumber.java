package Numbers;

import java.util.Scanner;

public class StrongNumber {
	
	
	public static void main(String[] args) {
		
		// 1234
		
		Scanner sc = new Scanner(System.in);
		
		
		System.out.println("Please enter number ");
		int num = sc.nextInt();
		int temp = num ;
		int sum =0 ;
		
		while(temp!=0) {
			
			int rem = temp%10;
			
			sum=sum+findFactorial(rem);
			
			temp/=10;  // 123 , 12 , 1 , 0
			
			
			
		}
		
		if(num == sum) {
			System.out.println("This number is Strong number :"+num);
		}
		else {
			System.out.println("Thise number is not a stong number");
		}
			
	}
	
	// 5 = 1*2*3*4*5
	
	private static int findFactorial(int digit) {
		// TODO Auto-generated method stub
		
		//4
		
		int factorial=1;
		for(int i = 1 ; i<= digit ; i++) {
			
			factorial = factorial*i ;
			
			
		}
		
		return factorial;

	}

}
