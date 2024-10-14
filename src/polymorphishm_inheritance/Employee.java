package polymorphishm_inheritance;

public class Employee {
	
	
	
	private String firstName ; 
	private String lastName ;
	private int registration ;
	private int age ;
	private int daysWorked ;
	
	private int vacationDaysTaken;
	private double salary;
	private int yearWorked;
	
	private String username="hello";
	private String password;
	
	
	
	
	
		
		
		
		
	
	
	
    
	
	public Employee(String firstName, String lastName, int registration, int age, int daysWorked, int vacationDaysTaken,
			double salary, int yearWorked) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.registration = registration;
		this.age = age;
		this.daysWorked = daysWorked;
		this.vacationDaysTaken = vacationDaysTaken;
		this.salary = salary;
		this.yearWorked = yearWorked;
		
	}
	void timeToRetirement() {
		
		
	               System.out.println("Time to retirement is :- "+Math.min(60 - age, 40 - this.yearWorked));
		
	}
	void vacationTimeLeft() {
		
		
		System.out.println("Vacation timelefft is :- "+(daysWorked/360)*(30 - vacationDaysTaken));
		
		
	}
	void calculateBonus() {
		System.out.println("Bonus is :- "+ 2.2*salary);
		
	}
	
	
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public int getRegistration() {
		return registration;
	}
	public void setRegistration(int registration) {
		this.registration = registration;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public int getDaysWorked() {
		return daysWorked;
	}
	public void setDaysWorked(int daysWorked) {
		this.daysWorked = daysWorked;
	}
	public int getVacationDaysTaken() {
		return vacationDaysTaken;
	}
	public void setVacationDaysTaken(int vacationDaysTaken) {
		this.vacationDaysTaken = vacationDaysTaken;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	public int getYearWorked() {
		return yearWorked;
	}
	public void setYearWorked(int yearWorked) {
		this.yearWorked = yearWorked;
	}
	
	

}
