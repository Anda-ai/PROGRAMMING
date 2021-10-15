/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package applogin;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.sql.SQLException;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

/**
 *
 * @author anda mxoza
 */
public class updateAppLogin {
    
    private JLabel emailLbl;
    private JLabel usnamLbl;
    private JLabel pwdLbl;
    private JLabel bckLbl;
    private JTextField emailfield;
    private JTextField usnamfield;
    private JTextField pwdfield;
    
    private JButton sgnBttn;
    
    JPanel panel;
    JFrame frame;
    
    register reg;//declares register class
    AppLogin app;
    
    String email;
    String username;
    String password;
    Boolean isUpdate;
    
    public updateAppLogin(JFrame frame) throws ClassNotFoundException, SQLException{
        
        this.frame = frame;//frame is only initialised in one class so 
                               //should be parsed in order to avoid null value
                               
        reg = new register("root","Boianda@5722", "applications");
        
        emailLbl = new JLabel("Email");
        emailLbl.setBounds(25,10,100,25);
        usnamLbl = new JLabel("New username");
        usnamLbl.setBounds(25,50,100,25);
        pwdLbl = new JLabel("New password");
        pwdLbl.setBounds(25,90,100,25);
        bckLbl = new JLabel("Go back");
        bckLbl.setBounds(150,140,100,25);
        emailfield = new JTextField();
        emailfield.setBounds(150,10,200,20);
        usnamfield = new JTextField();
        usnamfield.setBounds(150,50,200,20);
        pwdfield = new JTextField();
        pwdfield.setBounds(150,90,200,20);
        
        sgnBttn = new JButton("Enter");
        sgnBttn.setBounds(250,140, 100,25);
        
        panel = new JPanel(null);
        panel.add(emailLbl);
        panel.add(usnamLbl);
        panel.add(pwdLbl);
        panel.add(bckLbl);
        panel.add(emailfield);
        panel.add(usnamfield);
        panel.add(pwdfield);
        panel.add(sgnBttn);
        
        bckLbl.addMouseListener(new MouseAdapter(){  
            
            @Override
            public void mousePressed(MouseEvent e){   
                
                try {
                    System.out.println("go back");
                    app = new AppLogin(frame);
                    frame.remove(panel);
                    frame.add(app.panel);
                    frame.pack();
                } 
                catch (ClassNotFoundException | SQLException ex) {
                    ex.printStackTrace();
                }
            }  
        }); 
        
        ButtonHandler handler = new ButtonHandler();
        sgnBttn.addActionListener(handler);
        
    }
    private class ButtonHandler implements ActionListener{

        @Override
        public void actionPerformed(ActionEvent e){
            
            if (e.getSource() == sgnBttn){
                try {
                    System.out.println("Updating....");
                    email = emailfield.getText();
                    username = usnamfield.getText();
                    password = pwdfield.getText();
                    isUpdate = reg.update(email, username, password);
                    if(isUpdate){
                        app = new AppLogin(frame);
                        frame.remove(panel);
                        frame.add(app.panel);
                        app.usnamfield.setText(username);
                        app.pwdfield.setText(password);
                        frame.pack();
                        System.out.println("Successfully updated !!!");
                    }
                } 
                catch (SQLException | ClassNotFoundException ex) {
                    ex.printStackTrace();
                }
            }
        }
    }
}
