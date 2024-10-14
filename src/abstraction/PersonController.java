package abstraction;

public class PersonController {
	
	
	public static void main(String[] args) {
		
		
		Person person = new Person() {
			
			int a = 5 ;
			
			public void work() {
				
				System.out.println("From main class");
				System.out.println(a);
				
			}
			
		};
		person.work();
		
	}

}
