import java.util.Arrays;
public class Methods {
	
	
	
	private static void addition(int a ,int b) {
		// TODO Auto-generated method stub
		System.out.println("last method ");
		System.out.println(a+b);
		System.out.println("last method over");

	}
	
	
	
	
	private static void  substraction(int a,int b) {
		// TODO Auto-generated method stub
		System.out.println(a-b);
		int ch = 45 ;

	}
	
	
	
	
	private static void division(int a,int b) {
		// TODO Auto-generated method stub
		
		System.out.println(a/b);
		
		System.out.println("multiplication before method call");
		multiplication(a, b) ;
		System.out.println("multiplication after method call");

	}
	

	private static void multiplication(int a, int b) {
		// TODO Auto-generated method stub
		
		
		System.out.println(a*b);
		System.out.println("addition before method call");
		addition(a, b);
		System.out.println("addition after method call");

	}
	
	
	
	
		public static void main(String[] args) {
		
	//	division(10, 2);
		
		
		//System.out.println("Main method ends");
		information();

	 
	}
		
		private static void information() {
			// TODO Auto-generated method stub
				
			
			System.out.println("\r\n"
					+ "5\r\n"
					+ "multiplication before method call\r\n"
					+ "20\r\n"
					+ "addition before method call\r\n"
					+ "last method \r\n"
					+ "12\r\n"
					+ "last method over\r\n"
					+ "addition after method call\r\n"
					+ "multiplication after method call\r\n"
					+ "Main method ends");
		}
	
	
		

}
