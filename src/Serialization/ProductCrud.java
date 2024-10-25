package Serialization;

import java.util.ArrayList;
import java.util.Scanner;

public class ProductCrud {
	
		Scanner sc = new Scanner(System.in);
	
	private Product  addProduct( ) {
		// TODO Auto-generated method stub
		
		System.out.println("Enter Product id :");
		int id = sc.nextInt();
		
		System.out.println("Enter Product name :");
		String name = sc.next();
		
		System.out.println("Enter Product prize");
		double prize = sc.nextDouble();
		
		Product product =new Product(id, name, prize);
		
		return product;
		

	}
	
   public ArrayList<Product> addProductInList(Scanner sc) {
	// TODO Auto-generated method stub
	   
	   ArrayList<Product> arrayList = new ArrayList<Product>();
	   
	  
	   
	   while(true) {
		   System.out.println("1: to add product \n 2: Not to add");
		   int choice = sc.nextInt();
		   if(choice==1)
			   
			   arrayList.add(addProduct());
			   
			   else if (choice==2) return arrayList;
	   }
	   
	 //  return arrayList;
	   
	   

}
	

}
