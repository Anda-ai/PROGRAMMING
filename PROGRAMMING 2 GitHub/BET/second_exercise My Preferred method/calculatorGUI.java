/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calcgui;

import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

/**
 *
 * @author anda
 */
public class calculatorGUI {
    //Declaration............................
    operations op = new operations();
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
    private JFrame frame;
    int a;
    int b;
    String answer;
    /**
     * @param args the command line arguments
     */
    public calculatorGUI(){
        num1Label = new JLabel("Enter first number: ");
        num1Label.setBounds(20,50, 200, 10);
        num2Label = new JLabel("Enter Second number: ");
        num2Label.setBounds(20,100, 200, 10);
        
        num1TextField = new JTextField();
        num1TextField.setBounds(200,45, 150, 20);
        num2TextField = new JTextField();
        num2TextField.setBounds(200,95, 150, 20);
        
        addBtton = new JButton("+");
        addBtton.setBounds(100,150, 50, 20);
        subBtton = new JButton("-");
        subBtton.setBounds(150,150, 50, 20);
        divBtton = new JButton("/");
        divBtton.setBounds(200,150, 50, 20);
        mulBtton = new JButton("*");
        mulBtton.setBounds(250,150, 50, 20);
        
        ansLabel = new JLabel("Answer will appear here");
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
        
        //Button Actions.........................................................
        addBtton.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                getValues();
                answer = String.valueOf(op.add(a, b));
                ansLabel.setText("Answer is "+answer);
            }
        });
        subBtton.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                getValues();
                answer = String.valueOf(op.subtract(a, b));
                ansLabel.setText("Answer is "+answer);
            }
        });
        divBtton.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                getValues();
                answer = String.valueOf(op.divide(a, b));
                ansLabel.setText("Answer is "+answer);
            }
        });
        mulBtton.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                getValues();
                answer = String.valueOf(op.multiply(a, b));
                ansLabel.setText("Answer is "+answer);
            }
        });

        
    }
    public void getValues(){
        try{
            a = Integer.parseInt(num1TextField.getText());
            b = Integer.parseInt(num2TextField.getText());
        }
        catch(Exception e){
            System.out.print("\nPlease enter only numbers !!!!\n");
        }
    }
    public static void main(String[] args) {
        
       calculatorGUI gui = new calculatorGUI();
       gui.frame = new JFrame();
       gui.frame.setVisible(true);
       gui.frame.setPreferredSize(new Dimension(450, 450));
       gui.frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
       gui.frame.pack();
       gui.frame.add(gui.panel);
        
    }
}
