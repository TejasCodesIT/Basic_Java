package Serialization;
import java.util.ArrayList;
import java.util.Scanner;

public class CategoriesCrud {
	
	
	ProductCrud p_crud = new ProductCrud();
   
	
	public Categories addCategorie(Scanner sc ) {
		// TODO Auto-generated method stub
		
		System.out.println("Enter id of categore");
		int id = sc.nextInt();
		
		System.out.println("Enter categorie Name :");
		String name = sc.next();
		
		///boolean flag = true;
		ArrayList<Product> list=p_crud.addProductInList(sc);
		
		Categories categories = new Categories(id, name,list) ;
		
		return categories;
		
	  //  Categories  categories = new Categories(id,name);
			

	}
	
	
	public void deleteCategorie(Scanner sc) {
		// TODO Auto-generated method stub
		
		System.out.println("Enter categori id ");
		int id = sc.nextInt();

	}
	

}
