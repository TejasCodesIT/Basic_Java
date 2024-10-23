package Exception;

import java.io.FileWriter;
import java.util.Scanner;

public class FleWriter {
	
	public static void main(String[] args) {
		
		
		
		Scanner sc = new Scanner (System.in) ;
		
		System.out.println("Please enter a first name");
		String firstname = sc.next();
		System.out.println("Please Enter last name :- ");
		String lastName = sc.next();
		
		
		String fileName = "file.txt";
		
		
		try(FileWriter writer = new FileWriter(fileName)){
			
			writer.write(firstname);
			writer.write(" ");
			writer.write(lastName);
		}
		catch (Exception e) {
			// TODO: handle exception
			
			System.out.println("Input is wrong");
		}
		
	}

}
