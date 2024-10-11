package logicOperator;

import java.util.Scanner;

public class WeightGuru {
	
	
	public static void main(String[] args) {
		
		
		Scanner sc = new Scanner(System.in);
		Dao d = new Dao();
		
		System.err.println("*******************  Welcome to Weigth Guru *************");
		
		
		
		System.out.println("PLease Enter your Height in meter");
		double height = sc.nextDouble();
		
		
		
		
		
		
		
		System.out.println("Please enter your weight kg");
		double weight = sc.nextDouble();
		
		if(height>0&&height<2.76) {
			
			if(weight<150 && weight >0) {
				System.out.println(	d.calculateBMI(height, weight));
			}
			else System.out.println("Please enter valid weight");
			
		}
		else System.out.println("Please enter valid height");
		
		
		
	}
	
	
		
	
	

}
