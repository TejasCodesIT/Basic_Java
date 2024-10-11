package Functions;

import java.util.Scanner;

public class CalculatorBrain {
	
	
	private static void addition(int a,int b) {
		// TODO Auto-generated method stub
		
		System.out.println("Addition is  :- "+(a+b));

	}
	private static void substraction(int a,int b) {
		// TODO Auto-generated method stub
			System.out.println("Substraction is  :- "+(a-b));
	}
	
	private static void multiplication(int a,int b) {
		// TODO Auto-generated method stub
			
		System.out.println("Multiplication is :- "+(a*b));
		
	}
	private static void division(int a,int b) {
		// TODO Auto-generated method stub
		
		System.out.println("Division is :- "+(a/b));

	}
	
	private static void squareRoot(int a) {
		// TODO Auto-generated method stub
		
		System.out.println("Square Root ;- "+Math.sqrt(a));
		

	}
	
	private static void powerOff(int a , int b) {
		// TODO Auto-generated method stub
		
		System.out.println("Power is :- "+Math.pow(a, b));

	}
	
	
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Please Enter a value :- ");
		int a = sc.nextInt();
		System.out.println("Please Enter B value :- ");
		int b = sc.nextInt();
		
		addition(a,b);
		substraction(a, b);
		multiplication(a, b);
		division(a, b);
		squareRoot(a);
		powerOff(a, b);
		
	}

}
