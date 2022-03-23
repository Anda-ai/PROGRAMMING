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
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class loadGUI {
    
    JFrame frame;
    storage books;
    JPanel panel;
    
    JLabel h1Lbl;
    JLabel titLbl;
    JTextField titFld;
    JLabel authorLbl;
    JTextField authorFld;
    JLabel pgNumLbl;
    JTextField pgNumFld;
    JLabel desLbl;
    JTextField desFld;
    JLabel qtyLbl;
    JTextField qtyFld;
    JButton loadBtn;
    JButton backBtn;
    
    public loadGUI(JFrame frame, storage books, String name, String stffNum){
        
        
        frame.setTitle("Load a new Book");
        this.frame = frame;
        this.books = books;
        panel = new JPanel(null);
        
        h1Lbl = new JLabel("FILL IN BOOK INFORMATION: ");
        h1Lbl.setBounds(50, 25,200, 25);
        titLbl = new JLabel("Title: ");
        titLbl.setBounds(50, 70, 150, 25);
        titFld = new JTextField();
        titFld.setBounds(150, 70, 200, 25);
        authorLbl = new JLabel("Author: ");
        authorLbl.setBounds(50, 110, 150, 25);
        authorFld = new JTextField();
        authorFld.setBounds(150, 110, 200, 25);
        pgNumLbl = new JLabel("Pages: ");
        pgNumLbl.setBounds(50, 150, 150, 25);
        pgNumFld = new JTextField();
        pgNumFld.setBounds(150, 150, 200, 25);
        desLbl = new JLabel("Description: ");
        desLbl.setBounds(50, 190, 150, 25);
        desFld = new JTextField();
        desFld.setBounds(150, 190, 200, 75);
        qtyLbl = new JLabel("Quantity: ");
        qtyLbl.setBounds(50, 280, 150, 25);
        qtyFld = new JTextField();
        qtyFld.setBounds(150, 280, 200, 25);
        backBtn = new JButton("Dashboard");
        backBtn.setBounds(150, 340, 100, 25);
        loadBtn = new JButton("load");
        loadBtn.setBounds(250, 340, 100, 25);
        
        panel.add(h1Lbl);
        panel.add(titLbl);
        panel.add(titFld);
        panel.add(authorLbl);
        panel.add(authorFld);
        panel.add(pgNumLbl);
        panel.add(pgNumFld);
        panel.add(desLbl);
        panel.add(desFld);
        panel.add(qtyLbl);
        panel.add(qtyFld);
        panel.add(loadBtn);
        panel.add(backBtn);
        
        ButtonHandler handler = new ButtonHandler();
        backBtn.addActionListener(handler);
        loadBtn.addActionListener(handler);   
    }
    private class ButtonHandler implements ActionListener{
    	public void actionPerformed(ActionEvent e){
            if (e.getSource() == loadBtn){
                String title = titFld.getText();
                String author = authorFld.getText();
                String pgNum = pgNumFld.getText();
                String description = desFld.getText();
                String quantity = qtyFld.getText();
                
                books.append(title, author, pgNum, description, quantity);
            }
            else if (e.getSource() == backBtn){
                frame.remove(panel);
                dashboardGUI dash = new dashboardGUI(frame, books);
                dash.frame.add(dash.panel);
                dash.frame.pack();
            }
            else{
            }
        }
    }
    
}
