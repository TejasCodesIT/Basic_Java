package Exception;

public class Throw {
	
	
	public static void main(String[] args) throws Exception {
		
		
		int a = 5  ;
		float f = 1.5f;
		
		if(false) {
			System.out.println("True");
//			int b = a/0 ;
			
		}
		else {
			
			System.out.println("False");
		
			System.out.println();
			
			throw new ArithmeticException("Exception from else block");
		}
		
		
		
		
	}

}
