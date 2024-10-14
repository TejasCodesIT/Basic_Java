package abstraction;

public class ATMController {
	
	public static void main(String[] args) {
		
		SBI1 sbi = new SBI1();
		
		System.out.println(sbi.toString());
		sbi.message();
		sbi.withdraw();
	}

}
