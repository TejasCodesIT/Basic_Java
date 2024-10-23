package ControlFlow;

public class StaticVariable {
	
	 static String collegeName = "Modern" ;
	
	public  String studentName = "Tejas" ;
	
	
	StaticVariable(){
		System.out.println(collegeName);
		cheakAccessibility();
		
	}
		
			
		
	StaticVariable(String cName , String sName){
	
		collegeName=cName;
	
		studentName=sName;
	
	
	}
	
	public  void cheakAccessibility() {
		// TODO Auto-generated method stub
		System.out.println(studentName);
		System.out.println(collegeName);
		
		staticmethod();
	}
	
	private static void staticmethod() {
		System.out.println("this is static method");
	}

}
