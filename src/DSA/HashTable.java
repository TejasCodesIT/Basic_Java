package DSA;

import java.util.ArrayList;
import java.util.List;

public class HashTable {
	
	
	public int  size ;
	private List<List<Node>> table ;
	

	
	HashTable(int size){
		this.size= size;
		
		table = new ArrayList<>(size);
		
		for (int i = 0; i < size; i++) {
			
			table.add(new ArrayList<> ()) ;
			
			
		}
			
	}
	
	
	private int hashFunction(int key) {
		return key%size;
		
	}
	
	
	public void insert(int key,int value) {
		int index = hashFunction(key);
		List<Node> list = table.get(index);
		list.add(new Node(key,value));
		
		
	}
	
	public int search(int key) {
		
		int index = hashFunction(key);
		List<Node> list = table.get(index);
		
		for(Node n : list) {
			if(n.key==key) return n.value;
			
		}
		
		return -1;
		
	}
	

}
