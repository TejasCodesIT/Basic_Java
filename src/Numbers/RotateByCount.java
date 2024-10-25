package Numbers;

import java.util.Scanner;

public class RotateByCount {
	
	public static void main(String[] args) {
		
		
		// 1234   -----> 2341  
		
		Scanner sc =new Scanner(System.in);
		
		System.out.println("Please Enter a number :");
		int num = sc.nextInt();
		
		System.out.println("Enter number how many digit you have to shift :");
		int shift = sc.nextInt();
		
		int count=0; 
	
		
		
		
		
		//System.out.println(div);
		int rem=0;
		while(shift>=count) {
			
			int div = num / divisibleBy(num);// 1
			
			 rem = num % divisibleBy(num);// 234
			 System.out.println(rem);
			
			rem*=10;
			
			rem+=div;
			
			count++;
		
		}
		System.out.println("Now updated Number is  :"+rem);
		
		
		
		
		
		
	}
	
	public static int divisibleBy(int num) {
		// TODO Auto-generated method stub
		
		ArmStrongNumber number = new ArmStrongNumber();
		
		int count = number.countOFDigit(num);
		int mul=1;
		
		for(int i=1 ; i < count ; i++) {
			
			mul=mul*10;
			
			
		}
		
		return mul;

	}
	
	
	
		
		
	

}





