package collection;

import java.util.ArrayList;
import java.util.Iterator;

public class BookController {
	
	
	public static void main(String[] args) {
		
		ArrayList<Book> arrayList = new ArrayList<Book>();
		arrayList.add( new Book("ISBN1","Name1","Author1"));
		arrayList.add( new Book("ISBN3","Name3","Author3"));
		arrayList.add( new Book("ISBN2","Name2","Author2"));
		arrayList.add( new Book("ISBN5","Name5","Author5")); 
		arrayList.add( new Book("ISBN4","Name4","Author4"));
		
	   //   arrayList.get(1).printBook();		
		ArrayList<Categories> categories = new ArrayList<Categories>();
		
		 categories.add(new Categories(1, "Fiction", arrayList));
		 
		Categories cat1 = categories.get(0);    //.bklist.get(2).printBook();
		
		Book b1= cat1.bklist.get(3);
		
		cat1.printCategorieDetails();
		b1.printBook();
		
		
		
		
	}
	


}
