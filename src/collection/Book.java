package collection;

public class Book {
	//Create a class like book having the properties as ISBM , bOOK NAME , BOOK AUTHOR WITH functionality print book details 
		 //
	
	String ISBN ;
	String book_name;
	String author;
	
	
	
	public Book(String ISBN,String book_name,String author) {
		// TODO Auto-generated constructor stub
		
		this.ISBN =ISBN;
		this.book_name = book_name;
		this.author = author;
	}
	
	public void printBook() {
		System.out.println("ISMN  :"+this.ISBN);
		System.out.println("Book Nmae :"+this.book_name);
		System.out.println("Author Name :"+author);
	}
	

}
