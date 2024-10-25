package Numbers;

import java.util.Scanner;

public class KaprekarNumber {
	
	
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter a number ");
		
		int num = sc.nextInt();
		
		
		int sqr = num*num;
		int temp = num,count=0 ;
		
		while(temp!=0) {
			
			count++;
			temp/=10;
			
		}
		
		int mul =(int) Math.pow(10, count);
		System.out.println(mul);
		int last=sqr%mul;
		int first = sqr/mul;
		
		System.out.println(first);
		System.out.println(last);
		
		
		if((first+last)==num) {
			System.out.println("It is Kaprekar Number");
		}
		else System.out.println("It is not a kaprekar number");
		
		
		
		
		
	}
	

}























