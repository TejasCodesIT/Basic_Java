package collection;

import java.util.Iterator;
import java.util.*;


public class ArrayListClass {
	
	
	public static void main(String[] args) {
		

		 
	
		ArrayList<String> list=new ArrayList<String>();
		
		list.add("Ravi"); 
		printList(list);
//		System.out.println("******************************");
		
		list.add("Tejas");  
		printList(list);
//		System.out.println("******************************");
		list.add("Shubham");
//		System.out.println("******************************");
		printList(list);
//		System.out.println("******************************");
		list.add("Tejas");  
		printList(list);
//		System.out.println("******************************");
		
		System.out.println("Size of an array :"+list.size());
		//Add element in
		
		System.out.println("************** Add element  ****************");
		
		list.add(4, "Tejas");  // Add element in specific index
		
		System.out.println("************** Add Elelemt om cheak it is added or not  ****************");
		
		System.out.println("Element is added or not : "+list.add("Om")); // return boolean
		
		printList(list);
		
		System.out.println("************** Get Value by id ****************");
		
		System.out.println(list.get(2)); // Get a value
		
		System.out.println("************** Remove by Id  ****************");

		System.out.println("This element is remove  from list :"+list.remove(1)); // remove by id
		
		printList(list);
		System.out.println("******************************");
		
		System.out.println("This element is Set to the list :"+list.set(2, "Sai")); // set by id 
		printList(list);
		System.out.println("******************************");
		
//		System.out.println();
		System.out.println("Before Clear");
		list.clear();   // Clear all list
		printList(list);
		
		System.out.println("After clear");
		
		}
	
	public static void printList(ArrayList<String> array) {
		
		
				Iterator itr=array.iterator(); 
		
		while(itr.hasNext()){  
			
		System.out.println(itr.next());  
		
		}  
		
	}
	
	
	//Create a class like book having the properties as ISBM , bOOK NAME , BOOK AUTHOR WITH functionality print book details 
	 //

	
		
	

}
