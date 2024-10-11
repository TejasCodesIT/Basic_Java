package Variables;

import java.util.Scanner;

public class TypeCasting {
	
	static double py = Math.PI;
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Please Enter a Diameter size : ");
		
		
		double diameter= sc.nextInt();
		
		System.out.println("Area of circle is : "+calculateArea(diameter));
		System.out.println("Parameter of circle is : "+calculateParameter(diameter));
		
		
		
		
	}
	
	private static  float calculateArea(double diameter) {
		// TODO Auto-generated method stub
		double r = diameter/2;
	
		return (float) (py*(r*r));

	}
	
	private static float calculateParameter(double diameter) {
		// TODO Auto-generated method double
		
		double r = diameter/2;
		
		return (float)(r*2*py);

	}

}
