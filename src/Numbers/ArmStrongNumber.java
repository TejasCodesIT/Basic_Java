package Numbers;

import java.util.Scanner;

public class ArmStrongNumber {
	
	// 1*1*1 + 5*5*5 + 3*3*3 = 153
	
	
	public static void main(String[] args) {
			
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number ");
		int num = sc.nextInt();
		
		
		int newNumber= findSumOfProduct(num);
		
		if(newNumber == num) {
			
			
			System.out.println("This is ArmStrong Number ");
		}
		else {
			System.out.println("This is not a armstrong number");
		}
	
		
	}
	
	public static int countOFDigit(int num) {
		// TODO Auto-generated method stub
		
		int count=0;
		while(num!=0) {
			
			count++;
			num/=10;
		}
		return count;
		

	}
	
	public static int productOfDigit(int num , int count) {
		
		int product = 1 ;
		
		for(int i= 0;i<count ;i++) {
			
			product = product*num;
			
		}
		return product;
		
	}
	
	// 1*1*1 + 5*5*5 + 3*3*3 = 153
	
	
	private static  int findSumOfProduct(int num) {
		
			
				int sum =0 ;
				int count = countOFDigit(num);
				
				while(num!=0) {
					int rem = num%10; // 3
					int product= productOfDigit(rem,count);
					
					
					 sum = sum+product;
					 num/=10;
					
				}
							
				
				return sum;
		

	}
	
	
	
	
	

}
