package Generics;


public class PikuController {
	
	
	
	
	public static void main(String[] args) {
		
		
		Piku<String> piku = new Piku<String>();
		
		piku.add("Tejas");
		System.out.println("Name is :"+piku.get());
		 
		Piku<Integer> pikuint = new Piku<Integer>();
		pikuint.add(5454);
		System.out.println("Get Number  :"+pikuint.get());
	}

}
