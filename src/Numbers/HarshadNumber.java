package Numbers;

import java.util.Scanner;

public class HarshadNumber {
	
	
	
	public static void main(String[] args) {
		
		
		
		Scanner sc= new Scanner(System.in);
		
		System.out.println("Enter a first number : ");
		int num = sc.nextInt();
		
	if(num%	sumOfDigit(num)==0){
			System.out.println("It is Harshad Number");
		}
	else System.out.println("It is not a harshad Number");
		
		
	}
	
	
	public static int sumOfDigit(int num) {
		// TODO Auto-generated method stub
		int sum = 0,rem;
		while(num!=0) {
			rem=num%10;
			
			sum+=rem;
			num/=10;
			
		}
		return sum;

	}

}



















