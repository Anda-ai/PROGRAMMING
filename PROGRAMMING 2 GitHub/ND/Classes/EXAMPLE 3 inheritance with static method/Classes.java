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
    static int f = c* d;
    static int g = 20;
    static int h = 15;
    public static void main(String[] args) {
        // TODO code application logic here
        add();
        System.out.println("added..");
        ClassA calc = new ClassA();
        calc.subtract(g,h);
        System.out.println("substracted..");
        System.out.println(g+" / "+h+" = "+calc.divide(g,h)+" rounded off");
        System.out.println(g+" / "+h+" = "+calc.divideUnrounded(g,h)+" unrounded");
    }
}
