/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package library;

/**
 *
 * @author anda
 */
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JRadioButton;
import javax.swing.JButton;

public class dashboardGUI {
    
    JFrame frame;
    storage books;
    JPanel panel;
    
    JLabel heading;
    JLabel nameLbl;
    JLabel numLbl;
    JTextField nameFld;
    JTextField numFld;
    JRadioButton loadBttn;
    JRadioButton oddBttn;
    JButton lgnBttn;
    
    
    public dashboardGUI(JFrame frame, storage books){
        frame.setTitle("Dashboard");
        this.frame = frame;
        this.books = books;
        panel = new JPanel(null);
        
        heading = new JLabel("SELF-SERVICE KIOSK");
        heading.setBounds(50, 5, 400, 50);
        
        nameLbl = new JLabel("Full name");
        nameLbl.setBounds(50, 55, 150, 25);
        numLbl = new JLabel("Student/Staff number");
        numLbl.setBounds(50, 85, 150, 25);
        
        nameFld = new JTextField();
        nameFld.setBounds(200, 55, 200, 25);
        numFld = new JTextField();
        numFld.setBounds(200, 85, 200, 25);
        
        loadBttn = new JRadioButton("Load a book (admin only)");
        loadBttn.setBounds(50, 125, 200, 25);
        oddBttn = new JRadioButton("Order a book", true);
        oddBttn.setBounds(50, 150, 200, 25);
        
        lgnBttn = new JButton("Login");
        lgnBttn.setBounds(50, 200, 200, 25);
        
        panel.add(heading);
        panel.add(nameLbl);
        panel.add(numLbl);
        panel.add(nameFld);
        panel.add(numFld);
        panel.add(loadBttn);
        panel.add(oddBttn);
        panel.add(lgnBttn);
    
        ButtonHandler handler = new ButtonHandler();
        loadBttn.addActionListener(handler);   
        oddBttn.addActionListener(handler); 
        lgnBttn.addActionListener(handler); 
    }
    private class ButtonHandler implements ActionListener{
    	public void actionPerformed(ActionEvent e){
            if (e.getSource() == loadBttn){
                oddBttn.setSelected(false);
            }
            else if(e.getSource() == oddBttn){
                loadBttn.setSelected(false);
            }
            else if(e.getSource() == lgnBttn){
                String name = nameFld.getText();
                String id = numFld.getText();
                if(loadBttn.isSelected()){
                    frame.remove(panel);
                    loadGUI load = new loadGUI(frame, books, name, id);
                    load.frame.add(load.panel);
                    load.frame.pack();
                }
                else if(oddBttn.isSelected()){
                    frame.remove(panel);
                    orderGUI odd = new orderGUI(frame, books, name, id);
                    odd.frame.add(odd.panel);
                    odd.frame.pack();
                }
                else{
                }
            }
            else{
            }
        }
    }
}
    
