package polymorphishm_inheritance;

public class SalesManager extends SalesRep{
	
	
	
	
	private  double commisionByTeam;

	public SalesManager(String firstName, String lastName, int registration, int age, int daysWorked,
			int vacationDaysTaken, double salary, int yearWorked, double salesMade,double commisionByTeam)
	
	{
		
		super(firstName, lastName, registration, age, daysWorked, vacationDaysTaken, salary, yearWorked, salesMade);
		// TODO Auto-generated constructor stub
		
		this.commisionByTeam =commisionByTeam;
		
		
	
		
	}
	
	
	public  void calculateCommission() {
		// TODO Auto-generated method stub
		
		System.out.println("Commission of Sales Manager is :- "+getCommisionByTeam()*0.3);

	}


	public double getCommisionByTeam() {
		return commisionByTeam;
	}


	public void setCommisionByTeam(double commisionByTeam) {
		this.commisionByTeam = commisionByTeam;
	}
	
	public   void getDetailsOfManager() {
		// TODO Auto-generated method stub
		System.err.println("Here is Details of Manager :- ");
		
		System.out.println("First Name of Manager :- "+getFirstName());
		System.out.println("Last Name of Manager :- "+getLastName());
		System.out.println("Registration Number :- "+getRegistration());
		System.out.println("Age of Managaer :- "+getAge());
		System.out.println("Day Worked by Manager :- "+getDaysWorked());
		System.out.println("Vacation Days Taken :- "+getVacationDaysTaken());
		System.out.println("Salary Of Manager :- "+getSalary());
		System.out.println("Year Worked By Manager :- "+getYearWorked());
		System.out.println("Sales Made By Managar :- "+getSalesMade());
		System.out.println("Commision by Team in manager :-"+getCommisionByTeam());

	}
	
	
	

}
