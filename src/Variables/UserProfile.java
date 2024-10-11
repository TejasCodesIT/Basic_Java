package Variables;

import java.util.Scanner;

public class UserProfile {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		
		System.out.println("Enter your User name:- ");
		String userName= sc.next();
		
		System.out.println("Enter your Age");
		int age =sc.nextInt()  ;
		
		
		String jobpreference = sc.nextLine();
		System.err.println("Enter Job Prefereance ");
		 jobpreference = sc.nextLine();
		
		System.err.println("Enter your Nationality");
		String nationality = sc.next();
		
		System.out.println("Please enter your bood type :- ");
		String bloodType = sc.next();
		
		System.out.println("Enter gender :- ");
		char gender = sc.next().charAt(0);
		
		System.out.println("User name :- "+userName);
		System.out.println("Age : - "+age);
		System.out.println("Gender"+gender);
		System.out.println("Job"+jobpreference);
		System.out.println("Nationality :- "+nationality);
		System.out.println("Blood Type"+bloodType);
		
		
		System.out.println("BirthYear is : "+calculateAge(age));
		
		
	}
	
	
	private static  int calculateAge(int age) {
		// TODO Auto-generated method stub
		return 2024-age;
		

	}
	
	
	
	
	
	

}
