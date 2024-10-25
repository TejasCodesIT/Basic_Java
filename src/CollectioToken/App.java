package CollectioToken;


import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

public class App {

    public static void main(String[] args) throws Exception {
        // Define categories
        Category c1 = new Category(1, "Education");
        Category c2 = new Category(2, "Science");
        Category c3 = new Category(3, "Story");
        Category c4 = new Category(4, "Drama");

        List<Category> categories = new ArrayList<>();
        categories.add(c1);
        categories.add(c2);
        categories.add(c3);
        categories.add(c4);

      
    }

    public static void printDetails1(List<?> l1) {
        for (Object o : l1) {
            System.out.println("*");
            System.out.println(o);
            System.out.println("*");
        }
    }



    
    }
