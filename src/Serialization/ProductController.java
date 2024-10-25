package Serialization;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.StringTokenizer;



public class ProductController {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		ProductCrud p_crud = new ProductCrud();
		CategoriesCrud c_crud = new CategoriesCrud();
		
		ArrayList<Categories> listcatogory = new ArrayList<Categories>();		
		
		System.out.println("Please Enter your choice in between");
		System.out.println("1: Add categories\n 2:Tokenization \n ");
		
		int choice = sc.nextInt();
		
		switch (choice) {
			
		case 1: 
			
			listcatogory.add(c_crud.addCategorie(sc));
			System.out.println("Successfully added product in Category :"+listcatogory.getLast());
			break;
			
		case 2:
			
			readFromCSVAndWriteToNewFile();

		}
		
		
	}
	
	
	 // Method to read from CSV, tokenize and write to a new CSV file
    public static void readFromCSVAndWriteToNewFile() {
        String inputFilePath = "input.csv";  // Your input CSV file
        String outputFilePath = "output.csv";  // Your output CSV file

        try (
            BufferedReader reader = new BufferedReader(new FileReader(inputFilePath));
            PrintWriter writer = new PrintWriter(new FileWriter(outputFilePath));
        ) {
        	
            String line;

            // Write headers to the output CSV
            writer.println("Product ID,Product Name,Price");

            while ((line = reader.readLine()) != null) {
                // Tokenizing each line
                StringTokenizer tokenizer = new StringTokenizer(line, ",");
                int productId = Integer.parseInt(tokenizer.nextToken());
                String productName = tokenizer.nextToken();
                double price = Double.parseDouble(tokenizer.nextToken());

                // Print to console
                System.out.println("Product ID: " + productId + ", Name: " + productName + ", Price: " + price);

                // Write to new CSV file
                writer.println(productId + "," + productName + "," + price);
            }

            System.out.println("Data successfully written to: " + "output.csv");

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}
















