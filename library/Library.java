/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package library;

/**
 *
 * @author anda
 */
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Arrays;
import javax.swing.JFrame;


public class Library {
    
    public static void main(String[] args) { // main method
      
      JFrame frame = new JFrame("Title here...");
      storage book = new storage();
      dashboardGUI dash = new dashboardGUI(frame, book);
      frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      frame.setPreferredSize(new Dimension(500, 500));
      frame.setLocation(500, 250);
      frame.setVisible(true);
      frame.add(dash.panel);
      frame.pack();
    }

}



