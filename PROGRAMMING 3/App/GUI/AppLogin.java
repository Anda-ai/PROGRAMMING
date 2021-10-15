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
public class AppLogin extends loginConfirm{
    /**
     * @param args the command line arguments
     */
    private JLabel usnamLbl;
    private JLabel pwdLbl;
    private JLabel regLbl;
    JTextField usnamfield;
    JTextField pwdfield;
    
    private JButton lgnBttn;
    private JButton sgnBttn;
    
    JPanel panel;
    JFrame frame;
    
    String username;
    String password;
    
    public AppLogin(JFrame frame) throws ClassNotFoundException, SQLException{
        
        super("root","Boianda@5722", "applications");
        
        this.frame = frame;
        
        usnamLbl = new JLabel("Username");
        usnamLbl.setBounds(25,10,100,25);
        pwdLbl = new JLabel("Password");
        pwdLbl.setBounds(25,50,100,25);
        regLbl = new JLabel("Sign up");
        regLbl.setBounds(150,90,100,25);
        usnamfield = new JTextField();
        usnamfield.setBounds(150,10,200,20);
        pwdfield = new JTextField();
        pwdfield.setBounds(150,50,200,20);
        
        lgnBttn = new JButton("login");
        lgnBttn.setBounds(250,90, 100,25);
        sgnBttn = new JButton("update");
        sgnBttn.setBounds(250,130, 100,25);
        
        panel = new JPanel(null);
        panel.add(usnamLbl);
        panel.add(pwdLbl);
        panel.add(regLbl);
        panel.add(usnamfield);
        panel.add(pwdfield);
        panel.add(lgnBttn);
        panel.add(sgnBttn);
        
        regLbl.addMouseListener(new MouseAdapter(){  
            
            @Override
            public void mousePressed(MouseEvent e){  
                
                try{
                    System.out.println("Sign up !");
                    AppSignup app = new AppSignup(frame);//frame is only initialised on one class and used in many classes, parse !
                    frame.remove(panel);
                    frame.add(app.panel);
                    frame.pack();
                } 
                catch (ClassNotFoundException | SQLException ex){
                    ex.printStackTrace();
                }
            }  
        }); 
        
        ButtonHandler handler = new ButtonHandler();
        lgnBttn.addActionListener(handler);
        sgnBttn.addActionListener(handler);
        
    }
    private class ButtonHandler implements ActionListener{

        @Override
        public void actionPerformed(ActionEvent e){
            try {
                if (e.getSource() == lgnBttn){
                    System.out.println("Logging....");
                    username = usnamfield.getText();
                    password = pwdfield.getText();
                    if(isLogin(username, password)){
                        System.out.println("Login Successful");
                    }
                    else{
                        System.out.println("Wrong email or password...");
                    }
                }
                else if (e.getSource() == sgnBttn){
                    System.out.println("update !");
                    updateAppLogin app = new updateAppLogin(frame);
                    frame.remove(panel);
                    frame.add(app.panel);
                    frame.pack();
                }
                else{}
            } 
            catch (ClassNotFoundException | SQLException ex){
                    ex.printStackTrace();
            }
        }
    }
}
