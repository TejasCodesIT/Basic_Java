package abstraction;

public class BankController {
	
	public static void main(String[] args) {
		
		
		Bank b	;
		b = new SBI();
		
		System.out.println("Rate of SBI Interest is : "+b.getRateOfInterest()+" %");
		
		b=new PNB();
		
		System.out.println("Rate of Interest of PNB is :  "+b.getRateOfInterest()+" %");
		
	}

}
