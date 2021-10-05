/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calculatorgui;

import java.awt.Dimension;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

/**
 *
 * @author anda
 */
public class CalculatorGUI {
    //Declaration............................
    private JLabel num1Label;
    private JLabel num2Label;
    private JLabel ansLabel;
    private JTextField num1TextField;
    private JTextField num2TextField;
    private JPanel panel;
    private JButton addBtton;
    private JButton subBtton;
    private JButton divBtton;
    private JButton mulBtton;
    /**
     * @param args the command line arguments
     */
    public CalculatorGUI(){
        
        num1Label = new JLabel("Enter first number: "); //initialisation.....
        //.setBounds(x,y, w, h);
        num1Label.setBounds(20,50, 200, 10);
        num2Label = new JLabel("Enter Second number: ");
        num2Label.setBounds(20,100, 200, 10);
        
        num1TextField = new JTextField(); //initialisation.....
        //.setBounds(x,y, w, h);
        num1TextField.setBounds(200,50, 100, 20);
        num2TextField = new JTextField();
        num2TextField.setBounds(200,100, 100, 20);
        
        addBtton = new JButton("+");
        addBtton.setBounds(100,150, 50, 20);
        subBtton = new JButton("-");
        subBtton.setBounds(150,150, 50, 20);
        divBtton = new JButton("/");
        divBtton.setBounds(200,150, 50, 20);
        mulBtton = new JButton("*");
        mulBtton.setBounds(250,150, 50, 20);
        
        ansLabel = new JLabel("Ansa where"); //initialisation.....
        //.setBounds(x,y, w, h);
        ansLabel.setBounds(200, 200, 100, 20);
        
        
        panel = new JPanel(null);
        panel.add(num1Label);
        panel.add(num2Label);
        panel.add(num1TextField);
        panel.add(num2TextField);
        panel.add(addBtton);
        panel.add(subBtton);
        panel.add(divBtton);
        panel.add(mulBtton);
        panel.add(ansLabel);
        
        JFrame frame = new JFrame();
        frame.setVisible(true);
        frame.setPreferredSize(new Dimension(450, 450));
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.add(panel);
        
    }
    public static void main(String[] args) {
        // TODO code application logic here
       CalculatorGUI gui = new CalculatorGUI();
        
    }
}
