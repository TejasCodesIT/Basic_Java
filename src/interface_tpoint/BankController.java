package interface_tpoint;

public class BankController {
	
	
	public static void main(String[] args) {
		
		Bank bank = new SBI();
		System.out.println(bank.rateOfInterest());
	}

}
