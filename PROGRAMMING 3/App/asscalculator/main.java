/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package asscalculator;

import javax.swing.JFrame;

/**
 *
 * @author anda
 */
public class main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        guiCalc calc = new guiCalc();
        JFrame frame = new JFrame("Arithmetic Operations");
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(500, 500);
        frame.setLocation(430, 100);
        frame.add(calc.panel);
    }
    
}
