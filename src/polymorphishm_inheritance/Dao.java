package polymorphishm_inheritance;

public class Dao implements User{
	
	private String username = "empusername";
	private  String password = "1234";
	


	public Dao(String username, String password) {
		super();
		this.username = username;
		this.password = password;
	}



	public void login(String user,String pass) {
		
		System.out.println(username);
		
		if(username.equals(user)&& password.equals(pass)) {
			
			
			System.err.println("Log In successfull");	
			
			
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
		else System.out.println("Please enter valid input");

}
	
	

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}
	
}
