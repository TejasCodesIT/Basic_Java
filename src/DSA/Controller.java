package DSA;

public class Controller {
	public static void main(String[] args) {
		
		
		
		HashTable hs = new HashTable(5);
		
		
		hs.insert(5, 55);
		hs.insert(6, 66);
		hs.insert(7, 77);
		hs.insert(8, 88);
		hs.insert(9, 99);
		hs.insert(99, 1000);
		
		   if(hs.search(99)!=-1) System.out.println("Key is found");
		   else  System.out.println("NOPE Bad luck not found");
	       

		
	}

}
