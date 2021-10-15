/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package applogin;

import java.awt.Dimension;
import java.sql.SQLException;
import javax.swing.JFrame;

/**
 *
 * @author anda mxoza
 */
public class main {
    
    private static JFrame frame;
    
    public static void main(String[] args) throws ClassNotFoundException, SQLException {
        // TODO code application logic here
        frame = new JFrame();//On main class initialise frame before parsing to avoid null value
        AppLogin app = new AppLogin(frame);
        app.frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        app.frame.setPreferredSize(new Dimension(500, 500));
        app.frame.setLocation(250, 250);
        app.frame.setVisible(true);
        app.frame.pack();
         
        app.frame.add(app.panel);
    }
}
