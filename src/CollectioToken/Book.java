package CollectioToken;



public class Book {
	  
    String isbn;
    String bookName;
    String bookAuthor;
    public Book(String isbn,String bookName,String bookAuthor){
        this.isbn = isbn;
        this.bookName = bookName;
        this.bookAuthor = bookAuthor;
    }

    public void bookDetails(){
            System.out.println("Isbn = "+isbn);
            System.out.println("Book Name = "+bookName);
            System.out.println("Author = "+bookAuthor);
    }

    @Override
    public String toString() {
      return "Book [isbn=" + isbn + ", bookName=" + bookName + ", bookAuthor=" + bookAuthor + "]";
    }

    
}