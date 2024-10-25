package String;

public class VowelsConsanants {
	
	public static void main(String[] args) {
		
		
		String str = " Hi my name is tejas Pradip WAKCHAURE";
		
		int vowels_count =  0;
		
		int consonant = 0;
		
		for (int i = 0; i < str.length(); i++) {
			
			if(str.charAt(i)=='a' || str.charAt(i)=='A' || str.charAt(i)=='e' ||str.charAt(i)=='E' ||str.charAt(i)=='i' ||
					str.charAt(i)=='I' || str.charAt(i)=='o' ||str.charAt(i)=='O' ||str.charAt(i)=='u' ||str.charAt(i)=='U'){
				
				vowels_count++;
				
			}
			else if(str.charAt(i)!=' ') {
				consonant++;
			}
			
		}
		System.out.println("Vowels are  : " +vowels_count);
		System.out.println("Consonent are :"+consonant);
		
	}

}
