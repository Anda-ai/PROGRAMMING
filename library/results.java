/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package library;

import java.awt.Color;
import java.awt.Dimension;
import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.JComponent;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.border.Border;

/**
 *
 * @author anda
 */
public class results extends JFrame {
    
    int max = 500;
    
    JPanel book[] = new JPanel[max];
    JLabel[] titleLbl = new JLabel[max];
    JLabel[] authorLbl = new JLabel[max];
    JLabel[] pgNumLbl = new JLabel[max];
    JButton[] selectBtn = new JButton[max];
    
    Border blackline = BorderFactory.createLineBorder(Color.lightGray, 1, true);
    
    public JPanel book(int id, String title, String author, String pages){
        
        book[id] = new JPanel(null); 
        book[id].setPreferredSize(new Dimension(792,75));
        book[id].setMaximumSize(new Dimension(792,75));
        book[id].setBorder(blackline);
        
        titleLbl[id] = new JLabel(title);
        titleLbl[id].setBounds( 10, 5, 200, 25);
        authorLbl[id] = new JLabel("Author: "+ author);
        authorLbl[id].setBounds( 10, 40, 200, 25);
        pgNumLbl[id] = new JLabel(pages + " pages");
        pgNumLbl[id].setBounds( 290, 5, 100, 25);
        selectBtn[id] = new JButton("Select");
        selectBtn[id].setBounds( 280, 40, 100, 25);
        
        book[id].add(titleLbl[id]);
        book[id].add(authorLbl[id]);
        book[id].add(pgNumLbl[id]);
        book[id].add(selectBtn[id]);
        
        return book[id];
    }
    
}
