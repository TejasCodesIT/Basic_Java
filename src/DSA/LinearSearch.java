package DSA;

import java.util.Scanner;

public class LinearSearch {
	
	public static void main(String[] args) {
		
		
		Scanner sc = new Scanner(System.in) ;
		System.err.println("Enter the size of an array");
		
		int size = sc.nextInt();
		
		int[] array = new int[size] ;
		
		System.err.println("Now Please enter values in array");
		
		for(int i = 0 ; i < size ; i++) {
			
			System.out.println("Enter value at index  :- "+i);
			
			array[i]=sc.nextInt();
			
			
		}
		System.err.print("Now Enter Search Value :-");
		int search = sc.nextInt();
		
		int flag=0 ,c;
		for( c= 0  ; c<size ; c++) {
			
			if(array[c]==search) {
				
				flag=1 ;
				break ;
			}
			
		}
		System.out.println("****************************************");
		if(flag==0) System.err.println("Number is not found");
		
		else System.err.println("Number found at :-   "+(c+1)+" Position");
		
	}

}








