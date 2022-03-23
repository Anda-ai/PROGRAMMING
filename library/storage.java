/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package library;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/**
 *
 * @author anda
 */
public class storage {
    
    String[][] Books = {{}};
    //List<String> bookList = new ArrayList<String>();
    ArrayList<ArrayList<String>> bookList = new ArrayList<ArrayList<String>>();
    
    public storage(){
    }
    public storage(String[][] books){
        this.Books = books;
    }
    
    public String[][] append(String title, String author, String pgNum, String description, String quantity){
        
        bookList.add(new ArrayList<String>(Arrays.asList(
        title, author, pgNum, description, quantity)));
        System.out.println("bookList: "+bookList);
       
       Books = bookList.stream()
                .map(l -> l.stream().toArray(String[]::new))
                .toArray(String[][]::new);//dimensional arraylist to array
       
        return Books;
    }
}
