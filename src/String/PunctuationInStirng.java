package String;

public class PunctuationInStirng {
	
	
	public static void main(String[] args) {
		
		
		
		String str = "Here is punctuation mark sendtenc. ! this is exclamatory mark . this is single cot 'DEFE '  ";
		int count=0;
		
		
		for(int i =0 ; i < str.length();i++) {
			
			
			if(str.charAt(i)=='!' || str.charAt(i)==':' || str.charAt(i) == ','|| str.charAt(i) == ';'|| str.charAt(i) == '?'||
					str.charAt(i) == '.'|| str.charAt(i) == '_'|| str.charAt(i) == '-'|| str.charAt(i) == '-'|| str.charAt(i) == '('|| str.charAt(i) == ')' ) {
					
					System.out.println(str.charAt(i));
				count++;
			}
			
		}
		System.out.println("Count of Punctuation mark is "+count);
	}

}
