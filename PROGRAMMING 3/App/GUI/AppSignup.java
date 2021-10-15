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
public class AppSignup {
    
    //Gui variables....
    private JLabel namLbl;
    private JLabel snamLbl;
    private JLabel gnderLbl;
    private JLabel emailLbl;
    private JLabel pnumlLbl;
    private JLabel bckLbl;
    private JTextField namfield;
    private JTextField snamfield;
    private JTextField gnderfield;
    private JTextField emailfield;
    private JTextField pnumfield;
    private JButton regBttn;
    JPanel panel;
    JFrame frame;
    
    register reg;//declares register class
    AppLogin app;//declares login class
    //sign up varialbles.....
    String name;
    String surname;
    String gender;
    String email;
    int number;
    String username;
    String password;
    
    public AppSignup(JFrame frame) throws ClassNotFoundException, SQLException{
        
        this.frame = frame;//frame is only initialised in one class so 
                               //should be parsed in order to avoid null value
        reg = new register("root","Boianda@5722", "applications");                       
                               
        namLbl = new JLabel("Name");
        namLbl.setBounds(25,10,100,25);
        snamLbl = new JLabel("Surname");
        snamLbl.setBounds(25,50,100,25);
        gnderLbl = new JLabel("Gender");
        gnderLbl.setBounds(25,90,100,25);
        emailLbl = new JLabel("Email");
        emailLbl.setBounds(25,130,100,25);
        pnumlLbl = new JLabel("Phone number");
        pnumlLbl.setBounds(25,170,100,25);
        bckLbl = new JLabel("Go back");
        bckLbl.setBounds(150,220,100,25);
        namfield = new JTextField("");
        namfield.setBounds(150,10,200,20);
        snamfield = new JTextField();
        snamfield.setBounds(150,50,200,20);
        gnderfield = new JTextField();
        gnderfield.setBounds(150,90,200,20);
        emailfield = new JTextField();
        emailfield.setBounds(150,130,200,20);
        pnumfield = new JTextField();
        pnumfield.setBounds(150,170,200,20);
        regBttn = new JButton("Sign up");
        regBttn.setBounds(250,220, 100,25);
        
        panel = new JPanel(null);
        panel.add(namLbl);
        panel.add(snamLbl);
        panel.add(emailLbl);
        panel.add(gnderLbl);
        panel.add(pnumlLbl);
        panel.add(bckLbl);
        panel.add(namfield);
        panel.add(snamfield);
        panel.add(gnderfield);
        panel.add(emailfield);
        panel.add(pnumfield);
        panel.add(regBttn);
        
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
        regBttn.addActionListener(handler);
        
    }
    private class ButtonHandler implements ActionListener {
        
        @Override
        public void actionPerformed(ActionEvent e) {
            
            if (e.getSource() == regBttn){
                try {
                    System.out.println("\nSigning up....");
                    name = namfield.getText();
                    surname = snamfield.getText();
                    gender = gnderfield.getText();
                    email = emailfield.getText();
                    number = Integer.parseInt(pnumfield.getText());
                    String[] login = reg.append(name, surname, gender, email, number);
                    if(login[2]=="registered"){
                        System.out.println("\nSign up successful");
                        System.out.println("\nGo back to sign in");
                        app = new AppLogin(frame);
                        frame.remove(panel);
                        frame.add(app.panel);
                        app.usnamfield.setText(login[0]);
                        app.pwdfield.setText(login[1]);
                        frame.pack();
                    }
                } 
                catch (ClassNotFoundException | SQLException ex) {
                    ex.printStackTrace();
                }
            }
        }
    }
}
