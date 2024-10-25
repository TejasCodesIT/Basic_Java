package CollectioToken;

import java.util.*;
public class Category{
  int c_ID;
  String c_Name;
  List<Book> products;
 


  public Category(int id,String cName){
    this.c_ID = id;
      this.c_Name=cName;
      this.products = new ArrayList<Book>();

  }

  public String getName() {
      return c_Name;
  }

  public void addProduct(Book product) {
      products.add(product);
  }

  public List<Book> getProducts() {
      return products;
  }

@Override
public String toString() {
    return "Category [c_ID=" + c_ID + ", c_Name=" + c_Name + ", products=" + products + "]";
}
public void addCategory(Book b1){
    this.products.add(b1);
}
 
}