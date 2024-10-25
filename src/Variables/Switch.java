package Variables;

public class Switch {
	
	public static void main(String[] args) {
		
		
		int a =65;
		int b=2;
		int x=3;
		String day="monday"; //127 a =97   , z = 122
		
		switch (a) {
		
		case 'A' :
			System.out.println("It match at case1");
			break;
					
		case  67:
			
			System.out.println("It match with case 2") ;
			break;
			
		case 1+2://128
			System.out.println("It match in case 3") ;
			break;
			
		case 12:
			System.out.println("From case 4");
			
		break;
		
	}

}
}