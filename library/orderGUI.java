/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package library;

/**
 *
 * @author anda
 */
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.ScrollPane;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.Arrays;
import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextField;
import javax.swing.ScrollPaneLayout;
import javax.swing.border.LineBorder;
import javax.swing.JComponent;

public class orderGUI extends results {
    JFrame frame;
    storage books;
    searchEngine robot;
    JPanel panel;
    
    JTextField searchFld;
    JScrollPane scrollPane;
    JPanel panePanel;
    
    BoxLayout box;
    
    String text;
    String results[][];
    
    public orderGUI(JFrame frame, storage books, String name, String stdNum){
        frame.setTitle("Order a Book");
        this.frame = frame;
        this.books = books;
        robot = new searchEngine();
        panel = new JPanel(null);
        panePanel = new JPanel();
        box = new BoxLayout(panePanel, BoxLayout.Y_AXIS);
        panePanel.setLayout(box);
        
        searchFld = new JTextField();
        searchFld.setToolTipText("Search...");
        searchFld.setBounds(50, 25,400, 25);
        
        //panePanel.add(book(0,  "electronics", "Anda Shologu", "70"));
        //panePanel.add(book(1,  "machines", "Floyed Shologu", "54"));
        
        scrollPane = new JScrollPane();
        scrollPane.setBounds(50, 70, 400, 375);
        scrollPane.setHorizontalScrollBarPolicy(JScrollPane.HORIZONTAL_SCROLLBAR_NEVER);  
        scrollPane.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED);  
        scrollPane.getViewport().setOpaque(false);
        scrollPane.setOpaque(false);
        scrollPane.getViewport().add(panePanel);
        
        panel.add(searchFld);
        panel.add(scrollPane);
        
        KeyHandler handler = new KeyHandler();
        searchFld.addKeyListener(handler);
        
        results = books.Books;
        for(int i=0;i<results.length;i++){//search results  
            panePanel.add(book(i, results[0][0], results[i][1], results[i][2]));
            frame.pack();
        }
    }
    private class KeyHandler extends KeyAdapter{
        @Override
        public void keyPressed(KeyEvent e) {
            if (e.getSource() == searchFld){
                
                text = searchFld.getText();
                results = robot.searchResults(text, books.Books);
                System.out.println("results: "+Arrays.deepToString(results));
                panePanel.removeAll();
                frame.pack();
                for(int i=0;i<results.length;i++){//search results  
                    panePanel.add(book(i, results[0][0], results[i][1], results[i][2]));
                    frame.pack();
                }
                
                //public JPanel book(int id, String title, String author, String pages){
                    
                    //String title, String author, String pgNum, String description, int quantity){
            }
        }
    }
}
