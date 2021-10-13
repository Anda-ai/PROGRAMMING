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
/*
This class is used by class C for demostration of abstract class
*
*/
public class ClassA {
    double ans;
    public void subtract(int g, int h){
        System.out.println(g+" - "+h+" = "+(g-h));
    }
    
    public int divide(int g, int h){
        ans = g/h;
        return (int) Math.round(ans);
    }
    public double divideUnrounded(int g, int h){
        double ans = g/h;
        return ans;
    }
}
