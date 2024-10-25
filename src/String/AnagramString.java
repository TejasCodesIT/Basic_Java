package String;

import java.util.Scanner;

public class AnagramString {
	
	
	public static void main(String[] args) {
		
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter first String :");
		String str1 = sc.next();
		
		System.out.println("Enter secound Sring : ");
		String str2 = sc.next();
		
		if(str1.length()==str2.length()) {
			
			for(int i = 0 ; i < str1.length();i++) {
				
				for(int j=0;j<str2.length();j++) {
					
					if(str1.charAt(i)==str2.charAt(j)) {
						
					}
					
				}
				
			}
			
		}
		else System.out.println("This string are not a Anagram String");
		
	}

}
