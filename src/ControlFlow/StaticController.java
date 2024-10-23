package ControlFlow;

import java.util.jar.Attributes.Name;

public class StaticController {
			
	 int a  = 5;
	
	
	
	public static void main(String[] args) {
		
		System.out.println("From main method");
		System.out.println();
		StaticVariable staticVariable = new StaticVariable();
		System.out.println(staticVariable.studentName);
	}
	
	

}
