package collection;

import java.util.ArrayList;
import java.util.List;

public class Categories {
	
	int cid;
	String cname;
	ArrayList<Book> bklist;
	
	


	public Categories(int cid, String cname, ArrayList<Book> list) {
		super();
		this.cid = cid;
		this.cname = cname;
		this.bklist = list;
		
	}
	
	public void printCategorieDetails() {
		// TODO Auto-generated method stub
		
		System.out.println("Cid :"+cid);
		System.out.println("Name :"+cname);
		

	}
	
//	@Override
//	public String toString() {
//		// TODO Auto-generated method stub
//		
//		System.out.println("Name :" +cname);
//		System.out.println("cid :" +cid);
//		return super.toString();
//	}
	
	

}
