/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package library;

/**
 *
 * @author anda
 */
import java.util.ArrayList;
import java.util.Arrays;

public class searchEngine {
    
    String results[][] = {{}};
    ArrayList<ArrayList<String>> resultList;
     
    public String[][] searchResults(String key, String arrList[][]){
        
        resultList = new ArrayList<ArrayList<String>>();
        
        for(int i=0;i<arrList.length;i++){//search results  
            
            if(arrList[i][0].contains(key)){    
                System.out.println("Search box text '"+key+"' exists in: "+arrList[i][0]);
                resultList.add(new ArrayList<String>(Arrays.asList(
                        arrList[i][0], arrList[i][1], arrList[i][2], arrList[i][3])));
            }    
        }    
        
        results = resultList.stream()
                .map(l -> l.stream().toArray(String[]::new))
                .toArray(String[][]::new);//dimensional arraylist to array
        
        results = sortSearchResults(results);
        
        return results;
    }
    
    public String[][] sortSearchResults(String arrList[][]){
        for(int i = 0; i<arrList.length-1; i++){  
            for (int j = i+1; j<arrList.length; j++){  
                //compares each elements of the array to all the remaining elements  
                if(arrList[i][0].compareTo(arrList[j][0])>0){  
                    //swapping array elements  
                    String temp = arrList[i][0];  
                    arrList[i][0] = arrList[j][0];  
                    arrList[j][0] = temp;  
                }  
            }  
        }   
        return arrList;
    }
}
