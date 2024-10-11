package polymorphishm_inheritance;

public class SalesRep extends Employee {
	
	
	private double salesMade;
	

	public SalesRep(String firstName, String lastName, int registration, int age, int daysWorked, int vacationDaysTaken,
			double salary, int yearWorked, double salesMade) {
		
		
		super(firstName, lastName, registration, age, daysWorked, vacationDaysTaken, salary, yearWorked);
	
		this.salesMade = salesMade;
	
	}

	void calculateComission(){
		
		System.out.println("Commission is :- "+0.1*salesMade);
		
	}
	

	public double getSalesMade() {
		return salesMade;
	}



	public void setSalesMade(double salesMade) {
		this.salesMade = salesMade;
	}
	
	

}
