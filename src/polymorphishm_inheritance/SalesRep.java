package polymorphishm_inheritance;

public class SalesRep extends Employee {
	
	
	private double salesMade;
	

	public SalesRep(String firstName, String lastName, int registration, int age, int daysWorked, int vacationDaysTaken,
			double salary, int yearWorked, double salesMade) {
		
		
		super(firstName, lastName, registration, age, daysWorked, vacationDaysTaken, salary, yearWorked);
	
		this.salesMade = salesMade;
		
		
	
	}

	void calculateComission(){
		
		System.out.println("Commission of representative :- "+0.1*salesMade);
		
	}
	

	public double getSalesMade() {
		return salesMade;
	}



	public void setSalesMade(double salesMade) {
		this.salesMade = salesMade;
	}
	
	
	
	
	public void getDetailsOdSaleRepository() {
		// TODO Auto-generated method stub
		System.err.println("Here is Details of Sale Representative :- ");
		
		System.out.println("First Name of Sale Representative :- "+getFirstName());
		System.out.println("Last Name of Sale Representative  :- "+getLastName());
		System.out.println("Registration Number :- "+getRegistration());
		System.out.println("Age of Sale Representative  :- "+getAge());
		System.out.println("Day Worked by Sale Representative  :- "+getDaysWorked());
		System.out.println("Vacation Days Taken :- "+getVacationDaysTaken());
		System.out.println("Salary Of Sale Representative  :- "+getSalary());
		System.out.println("Year Worked By Sale Representative  :- "+getYearWorked());
		System.out.println("Sales Made By Sale Representative  :- "+getSalesMade());
		

	}
	
	
	

}
