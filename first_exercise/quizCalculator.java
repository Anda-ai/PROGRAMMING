/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package quizcalculator;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author anda
 */
public class quizCalculator{
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
    String[] operations = {"+", "-", "/","*"};
    String operation;
    operations op;
    
    public quizCalculator(){
        
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
                verifyAns();
            }
            else if(operation == "-"){
                
                calc_answer = op.subtract(randomA(), randomB());
                
                System.out.print("\nWhat is " + a + " - " + b + " equal to?\n");
                user_ansa  = Integer.parseInt(scanner.nextLine());
                verifyAns();
            }
            else if(operation == "/"){
                
                calc_answer = op.divide(randomA(), randomB());
                
                System.out.print("\nWhat is " + a + " / " + b + " equal to?\n");
                user_ansa  = Integer.parseInt(scanner.nextLine());
                verifyAns();
            }
            else if(operation == "*"){
                
                calc_answer = op.multiply(randomA(), randomB());
                
                System.out.print("\nWhat is " + a + " * " + b + " equal to?\n");
                user_ansa  = Integer.parseInt(scanner.nextLine());
                verifyAns();
            }
            else{}
        }
        if(score<2){
            System.out.print("\n\nYou got "+score+" correct answer\n");
        }
        else{
            System.out.print("\n\nYou got "+score+" correct answers\n");
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
      	quizCalculator calc = new quizCalculator();
    }
    
}
