/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dictionary;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/**
 *
 * @author anda
 */
public class notes {
    public notes(){
        // TODO code application logic here
        //ArrayList..................................................................    
        List strList = new ArrayList<>();
        
        //add at specified index
        strList.add(0, "conside");
        System.out.println(strList);
        strList.add(1, "minute");
        System.out.println(strList);
        //append
        strList.add("evident");
        System.out.println(strList);
        strList.add("practice");
        System.out.println(strList);
        //replace
        strList.set(1, "accord");
        System.out.println(strList);
        //remove
        strList.remove("accord");
        System.out.println(strList);

        if(strList.contains("conside")){//Search for conside...and will return True if exists
            System.out.println("True");
        }
        else{
            System.out.println("False");
        }
        if(strList.contains("consid")){//Search for conside( without writing full name)...and will return False if not exists
            System.out.println("True");
        }
        else{
            System.out.println("False");
        }
        for (int count = 0; count<strList.size();count++){
            if(strList.get(count).toString().contains("cons")){
                System.out.println("ArrayList contains "+strList.get(count));//Search for conside( without writing full name)...and will return True if exists
            }
        }
        //Array..................................................................    
        String[] list = {"conside", "minute", "accord"} ;
        //add at last
        //list.add("conside");//Arrays do not appear to have 'add' method
        //list.set(1, "accord");//Arrays do not appear to have 'set' method
        //list.remove("accord");//Arrays do not appear to have 'remove' method

        if(strList.contains("conside")){//Search for conside...and will return True
            System.out.println("True");
        }
        else{
            System.out.println("False");
        }
        if(strList.contains("consid")){//Search for conside...and will return False
            System.out.println("True");
        }
        else{
            System.out.println("False");
        }
        
        for (int count = 0; count<list.length;count++){
            if(list[count].contains("cons")){
                System.out.println("Array contains "+list[count]);
            }
        }
        //Or....another way of writing above for loop
        for (String word: list){
            if(word.contains("cons")){
                System.out.println("Array contains "+word);
            }
        }
        //Convert  Arrays to arrayList.........................................
        Integer[] intArray = new Integer[]{1, 2, 3, 4, 5};
        String[] nameArray = new String[]{"John", "Mark", "Joe", "Bill", "Connor"};

        System.out.println("intArray: "+intArray);
        System.out.println("nameList: "+nameArray);

        List<Integer> intList = new ArrayList<>(Arrays.asList(intArray));
        List<String> nameList = new ArrayList<>(Arrays.asList(nameArray));

        System.out.println("intList: "+intList);//will print in programming language
        System.out.println("nameList: "+(nameList));//will print in programming language

        //OR..............................

        Integer[] intArr = new Integer[]{1, 2, 3, 4, 5};
        String[] nameArr = new String[]{"John", "Mark", "Joe", "Bill", "Connor"};


        List<Integer> intlist = new ArrayList<>();
        List<String> namelist = new ArrayList<>();

        intlist = Arrays.asList(intArr);
        namelist = Arrays.asList(nameArr);
        System.out.println("intList: "+intList);//will print in programming language
        System.out.println("nameList: "+(nameList));//will print in programming language
        
        //Convert  arrayList to Arrays.........................................
        
        List<Integer> al = new ArrayList<Integer>();
        al.add(10);
        al.add(20);
        al.add(30);
        al.add(40);
  
        Object[] objects = al.toArray();
  
        // Printing array of objects
        for (Object obj : objects)
            System.out.print(obj + " ");
        System.out.println("Original object List : " + al);
  
        // Using reverse() method to
        // reverse the element order of mylist
        Collections.reverse(al);
  
        // Print all elements of list in reverse order
        // using reverse() method
        System.out.println("Reversed List: " + al);
        Collections.sort(al);
        System.out.println("Sorted List: " + al);
        //get what position is 30 in:
        System.out.println("No. 30 is in index "+al.indexOf(30));
        
    }
}
