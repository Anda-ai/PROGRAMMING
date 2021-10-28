/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package asscalculator;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
/**
 *
 * @author anda
 */
public class guiCalc{
    
    private JLabel title;
    private JLabel num1lbl;
    private JLabel num2lbl;
    private JLabel oplbl;
    private JLabel reslbl;
    
    private JTextField num1field;
    private JTextField num2field;
    private JComboBox<String> opBox; 
    private JTextField resfield;
    
    JButton resbtn;
    //JButton clrbtn;
    //JButton clbtn;
    
    private JPanel components;
    JPanel panel;
    calculator calc = new calculator();
    String[] operations = { "--Select--","Addition","Subtraction", "Multiplication","Division"};
    String operation;
    long num1;
    long num2;
    
    public guiCalc(){
        
        title = new JLabel("Arithmetic Operations");  
        title.setBounds(30, 30, 150, 25);
        title.setForeground(Color.blue);

        num1lbl = new JLabel("First number"); 
        num1lbl.setBounds(30, 30, 150, 25);
        num2lbl = new JLabel("Second number"); 
        num2lbl.setBounds(30, 70, 150, 25);
        oplbl = new JLabel("Select Operation"); 
        oplbl.setBounds(30, 120, 150, 25);
        reslbl = new JLabel("Results"); 
        reslbl.setBounds(30, 160, 150, 25);

        num1field = new JTextField(); 
        num1field.setBounds(200, 30, 200, 25);
        num2field = new JTextField(); 
        num2field.setBounds(200, 70, 200, 25);
        opBox = new JComboBox<String>(operations);
        opBox.setBounds(200, 120, 200, 25);
        opBox.setSelectedIndex(0);
        resfield = new JTextField(); 
        resfield.setBounds(200, 160, 200, 25);
        resfield.setEnabled(false);

       components = new JPanel(null);
       components.setBounds(30,70, 440, 215);
       components.setBorder(BorderFactory.createLineBorder(Color.black));
       components.add(num1lbl);
       components.add(num2lbl);
       components.add(oplbl);
       components.add(reslbl);
       components.add(num1field);
       components.add(num2field);
       components.add(opBox);
       components.add(resfield);

       resbtn = new JButton("Results");
       resbtn.setBounds(230, 325, 125, 25);
       //clrbtn = new JButton("Clear");
       //clbtn = new JButton("Clear");

       panel = new JPanel(null);
       panel.add(title);
       panel.add(components);
       panel.add(resbtn);
       //panel.add(clrbtn);
       //panel.add(clbtn);

       ButtonHandler handler = new ButtonHandler();
       resbtn.addActionListener(handler);
       //clrbtn.addActionListener(handler);
       //clbtn.addActionListener(handler);      
    }
    private class ButtonHandler implements ActionListener{
    	public void actionPerformed(ActionEvent e){
            if (e.getSource() == resbtn){
                operation = opBox.getSelectedItem().toString();
                num1 = Long.valueOf(num1field.getText());
                num2 = Long.valueOf(num2field.getText());
                if(operation.equals(operations[1]))
                    resfield.setText(calc.add(num1, num2));
                else if(operation.equals(operations[2]))
                    resfield.setText(calc.subtract(num1, num2));
                else if(operation.equals(operations[3]))
                    resfield.setText(calc.multiply(num1, num2));
                else if(operation.equals(operations[4]))
                    resfield.setText(calc.divide(num1, num2));
                else{}
            }
        }
    }
}
