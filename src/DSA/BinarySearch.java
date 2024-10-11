package DSA;

import java.util.Scanner;

public class BinarySearch {
	
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
		
		int search = sc.nextInt() ;
		
		binarySearch(size,array,search);
		
		
		
			
			
		}
	
	private static  void binarySearch(int size, int[] array,int search) {
		// TODO Auto-generated method stub
		
			int start,mid ,end;
				start = 0 ;
				end = size;
	
		mid = (start+size)/2 ;
		
		while(start<=end) {
		if(array[mid]==search) {

				System.out.println("Number found at index :- "+mid);
				break;

			}
		else if(array[mid]>search) {
			
			end = mid-1;
			
		}
		else {
			start = mid+1;
		}
		
		mid=(start+end)/2;
	}
		if(start>end) System.out.println("Element not found");
	
		
		
		
		
		
	}}
	
	
		
		
		
	



















