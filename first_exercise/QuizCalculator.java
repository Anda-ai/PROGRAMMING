/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package quizcalculator;

import java.util.Random;

/**
 *
 * @author anda
 */
//packages..................................





public class QuizCalculator{

    /**
     * @param args the command line arguments
     */
    String operation;
    String[] operations = {"add", "sub", "div", "mul"};
    
    Random rand = new Random();
    int a = 6;
    int b = 7;
    int answer;
    
    public QuizCalculator(){
        operations op = new operations();
        for(int count = 0; count < 10  ;count++){
            
            int j = rand.nextInt(4);
            
            operation = operations[j];
            
            if(operation == "add"){
                System.out.println("what is "+a+" + "+b+" equeal to ?");
                //scaan
                answer = op.add(a, b);
                System.out.println("The answer is "+ answer);
            }
            else if(operation == "sub"){
                answer = op.subtract(a, b);
                System.out.println("The answer is "+answer);
            }
            else if(operation == "div"){
                answer = op.division(a, b);
                System.out.println("The answer is "+answer);
            }
            else if(operation == "mul"){
                answer = op.multiply(a, b);
                System.out.println("The answer is "+answer);
            }
        }
    }
    public static void main(String[] args) {
        // TODO code application logic here
        QuizCalculator quiz = new QuizCalculator();
    }
    
}
