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
public class ClassA {
    static double ans;
    static void subtract(int g, int h){
        System.out.println(g+" - "+h+" = "+(g-h));
    }
    
    static int divide(int g, int h){
        ans = g/h;
        return (int) Math.round(ans);
    }
    static double divideUnrounded(int g, int h){
        double ans = g/h;
        return ans;
    }
}
