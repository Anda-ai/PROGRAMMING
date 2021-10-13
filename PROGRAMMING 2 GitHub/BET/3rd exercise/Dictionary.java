/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dictionary;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author anda
 */
public class Dictionary {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //notes collections = new notes();
        Scanner scanner = new Scanner(System.in); 
        int op = 0;
        String word;
        String defination;
        String[] wordlist = {"consider", "minute", "accord", "evident", "practice",
                                "intend", "concern" ,"commit", "issue", "approach"};
        List words = new ArrayList<>(Arrays.asList(wordlist));
        //System.out.println(words);
        String[] definationlist = {"deem to be", 
                                    "infinitely or immeasurably small", 
                                    "concurrence of opinion", 
                                    "clearly revealed to the mind or the senses or judgment", 
                                    "a customary way of operation or behavior",
                                    "have in mind as a purpose",
                                    "something that interests you because it is important",
                                    "perform an act, usually with a negative connotation",
                                    "some situation or event that is thought about",
                                    "move towards"};
        List definations = new ArrayList<>(Arrays.asList("deem to be", 
                                         "infinitely or immeasurably small", 
                                         "concurrence of opinion", 
                                         "clearly revealed to the mind or the senses or judgment", 
                                         "a customary way of operation or behavior",
                                         "have in mind as a purpose",
                                         "something that interests you because it is important",
                                         "perform an act, usually with a negative connotation",
                                         "some situation or event that is thought about",
                                         "move towards"));
        System.out.println("\n\n\nPlease choose what you want to do?\n\n");
        System.out.println("Select: \n\n");
        System.out.println("1 >> to search for words");
        System.out.println("2 >> to append the dictionary");
        System.out.println("3 >> to remove word from the dictionary");
        op = Integer.parseInt(scanner.nextLine());
        
        switch(op) {
            case 1:
                if(!words.isEmpty()){
                    System.out.println("Enter word to search...\n");
                    word = scanner.nextLine();
                    for (int count = 0; count<words.size();count++){
                        if(words.get(count).toString().contains(word)){
                            System.out.println(words.get(count)+": ");
                            System.out.println(definations.get(count)+"");
                        }
                    }
                }
                else{
                    System.out.println("No words to search");
                }
              break;
            case 2:
                System.out.println("Enter word\n");
                word = scanner.nextLine();
                System.out.println("Enter defination\n");
                defination = scanner.nextLine();
                words.add(word);
                definations.add(defination);
                System.out.println("Dictionary appended\n");
                System.out.println("New list: \n");
                System.out.println(words);
                System.out.println(definations);
              break;
            case 3:
                System.out.println("Enter word\n");
                word = scanner.nextLine();
                if(words.contains(word)){
                    int i = words.indexOf(word);
                    System.out.println("getting word "+word);
                    System.out.println("Index "+i);
                    words.remove(words.get(i));
                    definations.remove(words.get(i));
                    System.out.println("Word removed\n");
                    System.out.println("New list: \n");
                    System.out.println(words);
                    System.out.println(definations);
                }
                else{
                    System.out.println("No such word found !!!\n");
                    System.out.println("Words avalaible: \n");
                    System.out.println(words);
                }
              break;
            default:
              System.out.println("Invalid option...");
        }
    }
}
