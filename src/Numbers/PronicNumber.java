package Numbers;

import java.util.Scanner;

public class PronicNumber {
	
	
	public static void main(String[] args) {
		
		
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter a number : ");
		
		int num = sc.nextInt();
		
		int mul1 = num*2;
		int mul2= num*3;
		
		int temp = num;
		int count=0;
		
		while(temp!=0) {
			count++;
			temp/=10;
			
		}
		
		int div = (int) Math.pow(10, count*2+2);
	    
		
		 
		
		
	}

}

























