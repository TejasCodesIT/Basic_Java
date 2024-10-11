package polymorphishm_inheritance;

import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		
		
		SalesRep salerepo1 = new SalesRep("Om", "Tambe", 2, 20, 2160, 10, 50214.25, 6, 5000);
		SalesRep salerepo2 = new SalesRep("Sai", "Pansare", 3, 20, 2160, 10, 52214.25, 6, 6000);
		SalesRep salerepo3 = new SalesRep("Ram", "Gagare", 4, 20, 2160, 10, 55214.25, 6, 7000);
		SalesRep salerepo4 = new SalesRep("Suraj", "Musmade", 5, 20, 2160, 10, 58214.25, 6, 8000);
		SalesRep salerepo5 = new SalesRep("Pankaj", "Mali", 6, 20, 2160, 10, 50914.25, 6, 9000);
		SalesRep salerepo6 = new SalesRep("Vedant", "Tambe", 7, 20, 2160, 10, 50214.25, 6, 10000);
		
		double toptalTeamSale= salerepo1.getSalesMade()+salerepo2.getSalesMade()+salerepo3.getSalesMade()+salerepo4.getSalesMade()+salerepo5.getSalesMade();
		
		SalesManager sm = new SalesManager("Suryapalli", "Apppa", 7, 20, 2160, 10, 50214.25, 6, 10000,toptalTeamSale);
		
		sm.getDetailsOfManager();
		
		System.out.println();
		System.out.println("**************************************************");
		System.out.println();
		salerepo1.getDetailsOdSaleRepository();
		
		
										
	}

}
