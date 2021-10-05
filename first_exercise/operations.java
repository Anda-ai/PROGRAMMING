/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package quizquesions;

/**
 *
 * @author anda
 */
public class operations {
    private int ans;
    public int addQuiz(int a, int b){
        ans = (a + b);
        return ans;
    }
    public int subtractQuiz(int a, int b){
        ans = (a - b);
        return ans;
    }
    public int divideQuiz(int a, int b){
        try{
        ans = (a / b);
        }
        catch(Exception e){
            ans = 0;
        }
        return ans;
    }
    public int multiplyQuiz(int a, int b){
        ans = (a * b);
        return ans;
    }
}
