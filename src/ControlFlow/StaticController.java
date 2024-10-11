package ControlFlow;

public class StaticController {
	
	
	public static void main(String[] args) {
		
		
		StaticVariable s1 = new StaticVariable("COEP","Suraj");
		
		System.out.println(s1.collegeName);
		
		StaticVariable s2 = new StaticVariable();
		
		System.out.println(s2.collegeName);
		
	}

}
