package Numbers;

import java.util.Scanner;

public class EvenNumber {
	
	public static void main(String[] args) {
		
		
		
		// 0 , 2 , 4 , 6 , 8 , 10 ....
		
		
		
		Scanner scanner =new Scanner(System.in);
		
		System.out.println("Enter start of even number : ");
		int start = scanner.nextInt();
		
		System.out.println("Enter end of even number : ");
		int end = scanner.nextInt();
		
		for(int i= start ; i <= end ; i++ ) {
			
			if(i%2==0) {
				
				System.out.println("Even number is :"+i);
			}
			
		}
		
		
		
	}

}









