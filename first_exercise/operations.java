/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package quizcalculator;

/**
 *
 * @author anda
 */
public class operations {
    
    String operation;
    
    public operations(String operation){
        this.operation = operation;
    }
    
    public int add(int a, int b){
        return a + b;
    }
    
    public int subtract(int a, int b){
        return a - b;
    }
    
    public int divide(int a, int b){
        return a / b;
    }
    
    public int multiply(int a, int b){
        return a * b;
    }
    public void notifier(){
        System.out.println("\nPerforming " + operation + " operation.\n");
    }
}
