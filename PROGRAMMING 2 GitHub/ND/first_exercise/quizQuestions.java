/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package quizquesions;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author anda
 */
public class quizQuestions{
    /**
     * @param args the command line arguments
     */
    Random rand = new Random();
    Integer upperbound = 200;
    Scanner scanner = new Scanner(System.in); 
    private int j;
    int a;
    int b;
    private int score = 0;
    private int user_ansa;
    private int calc_answer;
    ArrayList<Integer> alist = new ArrayList();
    ArrayList<Integer> blist = new ArrayList();
    ArrayList<Integer> calc_list = new ArrayList();
    ArrayList<Integer> user_list = new ArrayList();
    ArrayList<String> op_list = new ArrayList();
    String[] operations = {"+", "-", "/","*"};
    String operation;
    operations op;
    
    public quizQuestions(){
        
      	System.out.print("\nI will ask you 10 Mathematic Quiz Questions...\n");
        
        for(int count=0; count<10;count++){
            
            j = rand.nextInt(4);
            operation = operations[j];
            op = new operations(operation);
            op.notifier();
            
            if(operation == "+"){
                
                calc_answer = op.add(randomA(), randomB());
                
                System.out.print("\nWhat is " + a + " + " + b + " equal to?\n");
                user_ansa  = Integer.parseInt(scanner.nextLine());
                alist.add(a);
                blist.add(b);
                calc_list.add(calc_answer);
                user_list.add(user_ansa);
                op_list.add("+");
                verifyAns();
            }
            else if(operation == "-"){
                
                calc_answer = op.subtract(randomA(), randomB());
                
                System.out.print("\nWhat is " + a + " - " + b + " equal to?\n");
                user_ansa  = Integer.parseInt(scanner.nextLine());
                alist.add(a);
                blist.add(b);
                calc_list.add(calc_answer);
                user_list.add(user_ansa);
                op_list.add("-");
                verifyAns();
            }
            else if(operation == "/"){
                
                calc_answer = op.divide(randomA(), randomB());
                
                System.out.print("\nWhat is " + a + " / " + b + " equal to?\n");
                user_ansa  = Integer.parseInt(scanner.nextLine());
                alist.add(a);
                blist.add(b);
                calc_list.add(calc_answer);
                user_list.add(user_ansa);
                op_list.add("/");
                verifyAns();
            }
            else if(operation == "*"){
                
                calc_answer = op.multiply(randomA(), randomB());
                
                System.out.print("\nWhat is " + a + " * " + b + " equal to?\n");
                user_ansa  = Integer.parseInt(scanner.nextLine());
                alist.add(a);
                blist.add(b);
                calc_list.add(calc_answer);
                user_list.add(user_ansa);
                op_list.add("*");
                verifyAns();
            }
            else{}
        }
        if(score<2){
            System.out.print("\n\nYou got "+score+" correct answer\n");
            System.out.print("..................................RESULTS..........................................\n");
            results();
        }
        else{
            System.out.print("\n\nYou got "+score+" correct answers\n");
            System.out.print("..................................RESULTS..........................................\n");
            results();
        }
        
        
    }
    private void results(){
         for(int count=0; count<calc_list.size(); count++){
            a = alist.get(count);
            b = blist.get(count);
            user_ansa = user_list.get(count);
            calc_answer = calc_list.get(count);
            System.out.print("\nYou were asked 'What is " + a + " "+op_list.get(count)+" " + b + " equal to?'\n");
            System.out.print("\nYour answer: "+user_ansa+"\n");
            System.out.print("\nCorrect answer: "+calc_answer+"\n\n\n");
         }
    }
    private int randomA(){
        a = rand.nextInt(upperbound); 
        return a;
    }
    private int randomB(){
        b = rand.nextInt(upperbound); 
        return b;
    }
    public void verifyAns(){
        try{
            if(user_ansa == calc_answer){
                System.out.print("Correct\n");
                score++;
            }
            else{
                System.out.print("Incorrect, "+a+" "+operation+" "+b+" = "+calc_answer+"\n\n");
            }
        }
        catch(Exception e){
             System.out.print("\nPlease enter only numbers !!!!\n");
        }
    }
    public static void main(String[] args)    
    {        
      	quizQuestions calc = new quizQuestions();
    }
    
}
