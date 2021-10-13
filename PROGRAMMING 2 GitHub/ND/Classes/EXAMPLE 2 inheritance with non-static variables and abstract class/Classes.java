/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package classes;

/**
 *
 * @author anda
 */
public class Classes extends ClassB{
    /**
     * @param args the command line arguments
     */
    int f = c * d;
    
    
    public Classes(){
        System.out.println(c + " * " + d + " = "+f);
        ClassA answer = new ClassA(f);
    }
    public static void main(String[] args) {
        // TODO code application logic here
        Classes calc = new Classes();
    }
    
}
