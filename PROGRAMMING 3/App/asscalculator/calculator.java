/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package asscalculator;

/**
 *
 * @author anda
 */
public class calculator{
    public String add(long value1, long value2){
        return String.valueOf(value1 + value2);
    }
    public String subtract(long value1, long value2){
        return String.valueOf(value1 - value2);
    }
    public String multiply(long value1, long value2){
        return String.valueOf(value1 * value2);
    }
    public String divide(long value1, long value2){
        return String.valueOf(value1 / value2);
    }
}
