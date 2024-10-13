package logicOperator;

import java.util.Scanner;

public class WeightGuru {
	
	
	public static void main(String[] args) {
		
		
		Scanner sc = new Scanner(System.in);
		Dao d = new Dao();
		
		int choice = 1;
		double height,weight;
		
		System.err.println("*******************  Welcome to Weigth Guru *************");
		
		while(choice>0) {
			
			System.err.println("Please Enter your Choice");
			
			System.out.println("1) Enter your Height  in Inch");
			
			System.out.println("2) Enter your Height in foot ");
			System.out.println("3) Enter your Height in Meter ");
			System.out.println("4)  LogOut ");
			
			 choice = sc.nextInt();
			
			
			
			switch (choice) {
			
			case 1 : 
				System.out.println("PLease Enter your Height in Inch");
				 height = sc.nextDouble();
				
				System.out.println("Please enter your weight kg");
				 weight = sc.nextDouble();
				height*=0.0254;
				
				if(height>0&&height<2992.13) {
					
					if(weight<150 && weight >0) {
						System.out.println(	d.calculateBMI(height, weight));
					}
					else System.out.println("Please enter valid weight");
					
				}
				else System.out.println("Please enter valid height");
				break;
				
		
			case 2:
				System.out.println("PLease Enter your Height in Foot");
				 height = sc.nextDouble();
				
				System.out.println("Please enter your weight kg");
				 weight = sc.nextDouble();
				
					height*=0.84124798975872;
				
				if(height>0&&height<9.055118) {
					
					if(weight<150 && weight >0) {
						System.out.println(	d.calculateBMI(height, weight));
					}
					else System.out.println("Please enter valid weight");
					
				}
				else System.out.println("Please enter valid height");
				
				break;
				
		
			case 3 :
				System.out.println("PLease Enter your Height in Meter");
				 height = sc.nextDouble();
				
				System.out.println("Please enter your weight kg");
				 weight = sc.nextDouble();

			if(height>0&&height<2.76) {
				
				if(weight<150 && weight >0) {
					System.out.println(	d.calculateBMI(height, weight));
				}
				else System.out.println("Please enter valid weight");
				
			}
			else System.out.println("Please enter valid height");
			break;
				
			
			case 4 : 
				System.err.println("LogOut Successfully");
				choice=0;
				break;
			
			}
			
		}
		
		
		
	}
	


}
