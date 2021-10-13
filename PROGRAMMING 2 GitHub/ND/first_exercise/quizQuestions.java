/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package quizquesions;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author anda
 */
public class quizQuestions extends operations{
    /**
     * @param args the command line arguments
     */
    Random rand = new Random();//call operation first beofe ans[]
    Integer upperbound = 200;
    Scanner scanner = new Scanner(System.in); 
    int randomNumber;
    int a;
    int b;
    int score = 0;
    int user_ansa;
    int calc_answer;
    String[] operations = {"add","sub","div","","mul"};
    String operation;
    public quizQuestions(){
        
      	System.out.print("\nI will ask you 10 maths questions...\n");
        
        for(int count=0; count<10;count++){
            randomNumber = rand.nextInt(4);
            operation = operations[randomNumber];
            if(operation == "add"){
                calc_answer = addQuiz(randomA(), randomB());
                System.out.print("\nWhat is "+a+" + "+b+" equal to?\n");
                verifyAns();
            }
            else if(operation == "sub"){
                calc_answer = subtractQuiz(randomA(), randomB());
                System.out.print("\nWhat is "+a+" - "+b+" equal to?\n");
                verifyAns();
            }
            else if(operation == "div"){
                calc_answer = divideQuiz(randomA(), randomB());
                System.out.print("\nWhat is "+a+" / "+b+" equal to?\n");
                verifyAns();
            }
            else if(operation == "mul"){
                calc_answer = multiplyQuiz(randomA(), randomB());
                System.out.print("\nWhat is "+a+" * "+b+" equal to?\n");
                verifyAns();
            }
            else{}
        }
        System.out.print("\n\nYou got "+score+" correct answers\n");
        
        
    }
    public void verifyAns(){
        try{
            user_ansa  = Integer.parseInt(scanner.nextLine());
            if(user_ansa == calc_answer){
                System.out.print("Correct\n");
                score++;
            }
            else{
                System.out.print("Incorrect, "+a+" + "+b+" = "+calc_answer+"\n\n");
            }
        }
        catch(Exception e){
             System.out.print("\nPlease enter only numbers !!!!\n");
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
    public static void main(String[] args)    
    {        
      	quizQuestions que = new quizQuestions();
    }
    
}
